	package Entities;

import java.util.Date;

public class Customer {
private int id;
private String firstName;
private String lastName;
private Date dateOfBirtth;
private String nationalityId;

public Customer() {
}

public Customer(int id, String firstName, String lastName, Date dateOfBirtth, String nationalityId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirtth = dateOfBirtth;
	this.nationalityId = nationalityId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public Date getDateOfBirtth() {
	return dateOfBirtth;
}

public void setDateOfBirtth(Date dateOfBirtth) {
	this.dateOfBirtth = dateOfBirtth;
}

public String getNationalityId() {
	return nationalityId;
}

public void setNationalityId(String nationalityId) {
	this.nationalityId =  nationalityId;
}
}
