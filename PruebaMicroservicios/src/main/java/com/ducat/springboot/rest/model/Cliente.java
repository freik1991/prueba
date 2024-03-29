package com.ducat.springboot.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

@Component

// Spring jpa jars.
@Entity
@Table(name= "cliente")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class Cliente {

	@Id
	private int id;
	private String name;
	private String lastname;
	private int age;
	private String birthdate;

	public Cliente() { }

	
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


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", age=" + age + ", birthdate=" + birthdate + "]";
	}
}