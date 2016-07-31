package com.innova.practice.programmingQuestions;
//g. Write a program to implement hashCode() and equals() methods.

public class Person {
	String firstName;
	String lastName;
	int age;
	public Person(String firstName,String lastName,int age){
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	@Override
    public boolean equals(Object o){
    	Person person = (Person) o;
		return this.firstName==firstName&&this.lastName==lastName&&this.age==age;
    }
	@Override
    public int hashCode(){
    	int hashCode=0;
    	hashCode +=firstName.hashCode();
    	hashCode +=lastName.hashCode();
    	hashCode +=Integer.toString(age).hashCode();
		return hashCode;
     }
    
	public static void main(String[] args) {
		Person p1 = new Person("john","michels", 25);
		Person p2 = new Person("john","michels", 25);
		Person p3 = new Person("robin","smith", 35);
		Person p4 = new Person("tim","smith", 45);
		Person p5 = new Person("tim","smith", 45);

		System.out.println(p1.equals(p2));
		System.out.println(p3.equals(p5));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p5.hashCode());

	}

}
