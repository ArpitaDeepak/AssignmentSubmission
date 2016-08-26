package com.practice;

public class SingletonDemo {

	public static void main(String[] args) {
	//	SingletonEx singleton = new Singletonex();//constructor is private
		SingletonEx singleton = SingletonEx.getSingletonInstance();
		singleton.printSingleton();
		singleton.printSingleton();
		singleton.printSingleton();
	}

}
