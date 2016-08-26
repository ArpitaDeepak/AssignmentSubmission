package com.practice;

public class SingletonEx {
	public static SingletonEx singletonInstance;

	private SingletonEx() {
	}

	public static SingletonEx getSingletonInstance() {
		if (null == singletonInstance) {
			singletonInstance = new SingletonEx();
		}
		return singletonInstance;
	}

	public void printSingleton() {
		System.out.println("Singleton obj:" + " "
				+ singletonInstance.toString());
	}
}
