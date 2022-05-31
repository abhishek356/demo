package com.abhishek.demo;

public class Alien1 {

	private String keyboard;
	Alien1(String keyboard)
	{
		
		this.keyboard = keyboard;
		System.out.println("The keyboard type is "+this.keyboard);
		
	}
private	int age;
     Computer com;
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
//	//
	public void code()
	{
		System.out.println("coding..");
	   // laptop.compile();
	    //System.out.println(laptop.getDisk());
		
	}
}
