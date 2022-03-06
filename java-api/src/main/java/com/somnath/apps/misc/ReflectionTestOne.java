package com.somnath.apps.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTestOne {

	public static void main(String args[]) {

		Employee emp1 = new Employee(101, "John", "Smith", 100_100);

		Class empClass = emp1.getClass();
		System.out.println("Class Name: " + empClass.getName());

		Method m[] = empClass.getDeclaredMethods();
		System.out.println("============ Declared Methods ==============");
		Arrays.stream(m).map(i -> i.getName()).forEach(System.out::println);

		System.out.println("============ Declared Fields ==============");
		Field f[] = empClass.getDeclaredFields();
		Arrays.stream(f).map(i -> i.getName()).forEach(System.out::println);

		System.out.println("============ Class object verification ==============");
		Class empClass2 = emp1.getClass();
		System.out.println("empClass == empClass2: " + (empClass == empClass2));

	}

	protected static class Employee {

		private int empId;
		private String firstName;
		private String lastName;
		private int salary;

		public Employee(int empId, String firstName, String lastName, int salary) {
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
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

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
	}
}
