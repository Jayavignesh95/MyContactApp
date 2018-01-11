package com.app;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class User {
 String name;
 Integer rollno;
 String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getRollno() {
	return rollno;
}
public void setRollno(Integer rollno) {
	this.rollno = rollno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
}
