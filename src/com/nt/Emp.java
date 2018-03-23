package com.nt;

import java.util.Comparator;

public class Emp  {
  String parentname;
  Integer age;
  String address;
  String houseno;
  String city;
private String name;
 
  Emp(String parentname,Integer age,String address,String houseno,String city){
	  this.parentname=parentname;
	  this.address=address;
	  this.houseno=houseno;
	  this.city=city;
	  
  }
public String getParentname() {
	return parentname;
}
public void setParentname(String parentname) {
	this.parentname = parentname;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getHouseno() {
	return houseno;
}
public void setHouseno(String houseno) {
	this.houseno = houseno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String toString() {
	return  "Emp[]" ;
	
}

}

