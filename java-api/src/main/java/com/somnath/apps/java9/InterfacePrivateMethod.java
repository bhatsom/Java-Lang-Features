package com.somnath.apps.java9;

public class InterfacePrivateMethod {

	public static void main(String[] args) {
		NestedInterface nestedInterface = new NestedInterface() {
		};
		nestedInterface.checkDefault();

		System.out.println("==================");
		NonNestedInterface nonNestedInterface = new NonNestedInterface() {
			@Override
			public void implementMe() {
				System.out.println("Executing implementMe..");
			}
		};
		nonNestedInterface.implementMe();
		nonNestedInterface.checkDefault();

	}

	//access can be public, private, protected, and default
	private interface NestedInterface {

		private static String staticPrivate() {
			return "STATIC PRIVATE";
		}

		private String instancePrivate() {
			return "INSTANCE PRIVATE";
		}

		public default void checkDefault() {
			String result = staticPrivate();
			if (result.equalsIgnoreCase("static private")) System.out.println("Static private method works!");

			NestedInterface self = new NestedInterface() {
			};
			result = self.instancePrivate();
			if (result.equalsIgnoreCase("instance private")) System.out.println("Instance private method works!");
		}

	}

}

//access can be only public, and default
interface NonNestedInterface {

	private static String staticPrivate() {
		return "STATIC PRIVATE";
	}

	private String instancePrivate() {
		return "INSTANCE PRIVATE";
	}

	void implementMe();

	default void checkDefault() {
		System.out.println("Executing DEFAULT method..");

		String result = staticPrivate();
		if (result.equalsIgnoreCase("static private")) System.out.println("Static private method works!");

		result = instancePrivate();
		if (result.equalsIgnoreCase("instance private")) System.out.println("Instance private method works!");

	}

}



