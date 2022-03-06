package com.somnath.apps.java9;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MapsInitializer {

	public static void main(String[] args) {
	}

	@SuppressWarnings("unused")
	public void createMapWithMapOf() {
		Map<String, String> emptyMap = Map.of();
		Map<String, String> singletonMap = Map.of("key1", "value");
		Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
	}

	@SuppressWarnings("unused")
	public void createMapWithMapEntries() {
		Map<String, String> map = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("name", "John"),
				new AbstractMap.SimpleEntry<>("city", "budapest"),
				new AbstractMap.SimpleEntry<>("zip", "000000"),
				new AbstractMap.SimpleEntry<>("home", "1231231231")
		);
	}

	@SuppressWarnings("unused")
	public void createMutableMaps() {
		Map<String, String> map = new HashMap<>(Map.of("key1", "value1", "key2", "value2"));
		Map<String, String> map2 = new HashMap<>(Map.ofEntries(
				new AbstractMap.SimpleEntry<>("name", "John"),
				new AbstractMap.SimpleEntry<>("city", "budapest")));

	}
}