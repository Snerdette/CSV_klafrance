package com.catalyst.cycle2015;

import java.time.format.DateTimeFormatter; 

/**
 * This entity is used to identify a record (row) from the database table, Employee 
 */
public class Employee {
	 private int employeeID, departmentID;
	 private String firstName, lastName, address, city, state, emp_date;
	 
	 
  //used to format the Employee's start date to MM/dd/yyyy
  	private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
  	
  	public Employee(int employeeID, int departmentID, String firstName, String lastName, String address, String city, String state){
  		this.employeeID = employeeID;
  		this.departmentID = departmentID;
  		this.firstName = firstName;
  		this.lastName = lastName;
  		this.address = address;
  		this.city = city;
  		this.state = state;
  		this.emp_date = emp_date;
  	}
  	
    /**
     * toString function displays all fields
     */
    @Override
    public String toString() {
    	return("Employee ID: " + employeeID + " Department ID: " + departmentID +" Name: "+ firstName + " " + lastName + " Address: "+ address +", "+ city + ", " + state + "Employed Since: "+ emp_date + "\n");
    	//TODO: Fill in contents of this method


    	//return null;
    	}
    
    
    
    // Getters and Setters
    
    
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

	public String getEmp_date() {
		return emp_date;
	}



	public void setEmp_date(String emp_date) {
		this.emp_date = emp_date;
	}



	public void employeeInfo(){
		System.out.println(firstName + " " + lastName);
		System.out.println("Employed Since: " + emp_date);
		System.out.println(address);
		System.out.println(city + "," + state);
	}
}
