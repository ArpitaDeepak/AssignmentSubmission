package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CustomKeyEx {
	public void createCustomKey() {
		Map<Employee, String> hmap = new HashMap<Employee, String>();
		Employee emp1 = new Employee(1);
		emp1.setName("Tom");
		Employee emp2 = new Employee(2);
		emp2.setName("Jim");
		hmap.put(emp1, emp1.getName());
		hmap.put(emp2, emp2.getName());
		//trying to set new values
	    emp1.setName("sam");
		emp2.setName("chris");
		//check if it doesn't change
		System.out.println(hmap.get(emp1));
		System.out.println(hmap.get(emp2));
		//try creating a new obj and checking
		Employee emp3 = new Employee(1);//for emp_id =1 we r trying to set new value and checking
		emp3.setName("john");
		System.out.println(hmap.get(emp3));
	}

	public static void main(String[] args) {
		CustomKeyEx cust = new CustomKeyEx();
		cust.createCustomKey();
	}

}
