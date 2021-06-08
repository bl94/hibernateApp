package com.luv2code.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.luv2code.hibernate.date.DateUtils;

import javax.persistence.Id;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	@Column(name="first_Name")
	private String firstName;
	
	@Column(name="last_Name")
	private String lastName;
	
	@Column(name="company")
	private String company;
	
	@Column(name="date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	public Employee(){
		
	}
	
	public Employee(String firstName, String lastName, String company, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", company=" + company
				+ ", dateOfBirth=" + DateUtils.convertDateToString(dateOfBirth) + "]";
	}

	
	

}
