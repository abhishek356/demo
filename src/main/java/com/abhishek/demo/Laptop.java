package com.abhishek.demo;

public class Laptop implements Computer{

	private String disk;
	private String ram;
	
	public String getDisk() {
		return disk;
	}
	public void setDisk(String disk) {
		this.disk = disk;
		System.out.println("inside setdisk");
		
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
		System.out.println("inside setram");
	}
	
	public void compile()
	{
		System.out.println("Laptop is used for compiling..");
	}
	
}
