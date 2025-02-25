package com.somnath.apps.java10;

public class LocalVarTypeInference {
	// doesn't work for class or instance variables
	// var instanceVariable = "Test";
	//static var instanceVariable = "Test";
	static String instanceVariable = "Test";

	public static void main(String[] args) {
		var name = "John Doe"; // Infers String type
		var age = 30; // Infers int type
		var salary = 50000.0; // Infers double type

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

		// Compile-time error: var must be initialized
		// var uninitializedVar;
	}

	// doesn't work for method parameters
	/* private void printName(var name) {
		System.out.println("Name: " + name);
	}*/
}
