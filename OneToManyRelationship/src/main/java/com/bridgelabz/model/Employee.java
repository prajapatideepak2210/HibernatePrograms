package com.bridgelabz.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Deepak Prajapati
 * @Description This class is a model class which have some details of Employee.
 *
 */
@Entity
@Table(name = "OneToMany_Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="mygen")
	@GenericGenerator(name="mygen", strategy="native")
	private int id;
	private String name;
	private String gender;

	@OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
	private Set<Vehicle> vehicles = new HashSet<Vehicle>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
