package com.allproject;

import java.util.ArrayList;
import java.util.List;

public class Practise  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Raja");
		Employee p=new Employee("Suraj");
		Employee q=new Employee("Parimal");
		List<Employee> ar=new ArrayList<>();
		
		ar.add(e);
		ar.add(p);
		ar.add(q);
		System.out.println(ar);
		e.compareTo(p);
		
		
		
		
		

	}

}
