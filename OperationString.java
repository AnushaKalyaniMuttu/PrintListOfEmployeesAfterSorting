package com.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperationString {

	public static void main(String [] args) {
		 List<Employee> employees = Arrays.asList(
		            new Employee("John", 50000),
		            new Employee("Jane", 60000),
		            new Employee("Bob", 45000),
		            new Employee("Alice", 90000)
		        );
		 
		 employees.stream().sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).forEach(System.out::println);
			}
		
	
	
}
