package com.somnath.apps.java9;

import com.google.common.collect.ImmutableList;

import java.util.*;

public class CollectionsCopyOf {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();
		myList.add("test1");
		myList.add("test2");
		myList.add("test3");
		listCopyOf(myList);

		// Set and Map work the same way
	}

	private static void listCopyOf(List<String> origList) {
		System.out.println("=============Executing listCopyOf()=================");
		//using Google's Guava API
		List<String> copiedList = ImmutableList.copyOf(origList);
		System.out.println("Guava: " + copiedList);

		try {
			copiedList.add("one more");
		} catch (Exception e) {
			System.out.println("Cannot add to an immutable list: " + e);
		}

		List<String> preJava9List = Collections.unmodifiableList(origList);
		System.out.println("Pre Java9: " + preJava9List);

		List<String> java9List = List.copyOf(origList);
		System.out.println("Java9: " + java9List);
	}

}
