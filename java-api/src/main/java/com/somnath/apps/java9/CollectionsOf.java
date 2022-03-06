package com.somnath.apps.java9;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.*;

public class CollectionsOf {

	public static void main(String[] args) {
		listOf();
		setOf();
		mapOf();
	}


	private static void listOf() {
		System.out.println("=============Executing listOf()=================");
		//using Google's Guava API
		List<String> immutableList = ImmutableList.of("test1", "test2", "test3");
		System.out.println("Guava: " + immutableList);

		List<String> preJava9List = new ArrayList<>();
		preJava9List.add("test1");
		preJava9List.add("test2");
		preJava9List.add("test3");
		System.out.println("Pre Java9: " + preJava9List);

		List<String> java9List = List.of("test1", "test2", "test3");
		System.out.println("Java9: " + java9List);
	}

	private static void setOf() {
		System.out.println("=============Executing setOf()=================");
		//using Google's Guava API
		Set<String> immutableSet = ImmutableSet.of("test1", "test2", "test1");
		System.out.println("Guava: " + immutableSet);

		Set<String> preJava9Set = new HashSet<>();
		preJava9Set.add("test1");
		preJava9Set.add("test2");
		preJava9Set.add("test1");
		System.out.println("Pre Java9: " + preJava9Set);

		// below throws IllegalArgumentException: duplicate element: test1
		//Set<String> java9Set = Set.of("test1", "test2", "test1");
		Set<String> java9Set = Set.of("test1", "test2");
		System.out.println("Java9: " + java9Set);
	}

	private static void mapOf() {
		System.out.println("=============Executing mapOf()=================");
		//using Google's Guava API
		Map<String, Integer> immutableMap = ImmutableMap.of("key1", 1, "key2", 2, "key3", 3);
		System.out.println("Guava: " + immutableMap);

		Map<String, Integer> preJava9Map = new HashMap<>();
		preJava9Map.put("key1", 1);
		preJava9Map.put("key2", 2);
		preJava9Map.put("key3", 3);
		System.out.println("Pre Java9: " + preJava9Map);

		Map<String, Integer> java9Map = Map.of("key1", 1, "key2", 2, "key3", 3);
		System.out.println("Java9: " + java9Map);
	}

	private static void guavaCopyOf(Set<String> set) {
		Set<String> immutable = ImmutableSet.copyOf(set);
		set.add("Costa Rica");
		System.out.println(immutable);
	}

	private static void coreJDK(Set<String> set) {
		Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
		set.add("Costa Rica");
		System.out.println(unmodifiableSet);
	}

	private static void java9Of() {
		Set<String> immutable = Set.of("Canada", "USA");
		System.out.println(immutable);
	}
}
