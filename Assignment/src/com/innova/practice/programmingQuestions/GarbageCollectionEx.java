package com.innova.practice.programmingQuestions;
//c. Write a program implementing explicit garbage collection.
public class GarbageCollectionEx {

	public static void main(String[] args) {
		GCExample ex = new GCExample("red");
		ex= null;
		Runtime.getRuntime().gc();
	}

}
class GCExample{
    String color;
	public GCExample(String color){
		this.color =color;
	}
	@Override
	public void finalize(){
		System.out.println(this.color + " cleaned");
	}
}
