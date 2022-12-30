package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> ls = new ArrayList<Employee>();

		Employee emp = (new Employee("sona", 101));
		Employee emp1 = (new Employee("ram", 111));
		Employee emp2 = (new Employee("veer", 109));

		ls.add(emp);
		ls.add(emp1);
		ls.add(emp2);

		System.out.println(ls);

		Collections.sort(ls, Comparator.comparing(Employee::getEmpId));

		System.out.println(ls);
                                                                  
	}
}