package com.practice;

import java.util.Objects;

//custom class
public class Employee {

	private String name;
	private int emp_id;

	public Employee(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpId(String emp_id) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_id);
	}

	// Compare only emp_id
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Employee e = (Employee) o;
		if (emp_id != e.emp_id)
			return false;
		return true;
	}
}
