package com.practice;

import java.util.Date;
//class is final so it cannot be changed.
public final class ImmutableClassEx {
	//String class and all wrapper classes are immutable and we are not providing setter or any other method to modify.
	private final String firstName;
	private final String lastName;
	private final Date dateOfBirth;//Date class is mutable, So need to handle carefully.
	//constructor private so that new instance cannot be created.
	private ImmutableClassEx(String firstName,String lastName,Date dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = new Date (dateOfBirth.getTime());
	}
	//getters
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public Date getDateOfBirth(){
		return new Date (dateOfBirth.getTime());
	}
	private static void toModifyAndCheck(String firstName,String lastName,Date dateOfBirth){
		firstName="bratt";
	    lastName="pitt";
	    dateOfBirth.setTime(10);
	 	} 
	@Override
	public String toString(){
		return firstName+"" +lastName+""+ dateOfBirth;
	}
	public static void main(String[] args) {
		ImmutableClassEx immutable = new ImmutableClassEx("Tom", "Hank",new Date());
       // System.out.println(immutable.getFirstName()+" "+immutable.getLastName()+" "+immutable.getDateOfBirth());
		System.out.println(immutable);
        ImmutableClassEx.toModifyAndCheck(immutable.getFirstName(),immutable.getLastName(),immutable.getDateOfBirth());
        System.out.println(immutable);
        
        
	}

}
