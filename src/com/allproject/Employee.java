package com.allproject;

public class Employee  implements Comparable<Employee>{
	
	String name;
	Employee e;

	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
			
		
		
		return 0;
	}
	

}
