package com.somnath.apps.java9;

import java.io.*;

public class TryWithResources {

	public static void main(String[] args) {

		String path = TryWithResources.class.getClassLoader().getResource("try-with-resources.txt").getPath();
		System.out.println("Pre Java 9");
		BufferedReader br = null;
		try {
			//br = new BufferedReader(new StringReader("Without Try-with-resources!"));
			br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // close() is not automatically invoked on operation completion expectedly or unexpectedly
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("\nWith Java 9 Try-With-Resources");

		try (BufferedReader br2 = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br2.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		BufferedReader's close() method is automatically called, ensuring that the file is properly closed.
		This eliminates the need for a finally block to handle resource closing,
		making the code cleaner and less prone to resource leaks.
		*/
	}
}
