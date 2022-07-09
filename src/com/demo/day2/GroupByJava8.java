package com.demo.day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByJava8 {

	public static void main(String[] args) {

		Employee e1 = new Employee("A", 23, 12000);
		Employee e2 = new Employee("Q", 45, 45000);
		Employee e3 = new Employee("R", 34, 34000);
		Employee e4 = new Employee("B", 76, 23000);
		Employee e5 = new Employee("V", 43, 78000);
		Employee e6 = new Employee("A", 19, 15000);

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

		// Salary>30k
		List<Employee> getSal = empList.stream().filter(sal -> sal.getSalary() > 30000).collect(Collectors.toList());

		// name=A and Salary=15000
		List<Employee> nameAndSal = empList.stream().filter(n -> n.getName().equals("A") && n.getSalary() == 15000)
				.collect(Collectors.toList());
		// System.out.println(nameAndSal);

		// Sort according to name
		List<Employee> nameSort = empList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());

		// Sort name and age
		List<Employee> nameAndAgeSort = empList.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getAge)))
				.collect(Collectors.toList());
		//System.out.println(nameAndAgeSort);
		
		//youngest Employee
		Optional<Employee> young = empList.stream().min(Comparator.comparing(Employee::getAge));
		//System.out.println(young);
		
		//oldest employee
		 Optional<Employee> old = empList.stream().max(Comparator.comparing(Employee::getAge));
		 //System.out.println(old);
		 
		 
		 
		 //Average Salary
		 Double sal = empList.stream().collect(Collectors.averagingInt(Employee::getSalary));
		 //System.out.println(sal);
		 
		 
	}

}
