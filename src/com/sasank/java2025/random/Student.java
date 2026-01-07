package com.sasank.java2025.random;

public class Student {
	
	int id;
	String name;
	int maths,physics,chemistry;
	
	public Student(int id, String name, int maths, int physics, int chemistry) {
		this.id = id;
		this.name = name;
		this.chemistry = chemistry;
		this.maths = maths;
		this.physics = physics;
	}
	
	public double calculateTotal() {
		
		return maths+physics+chemistry;
	}
	
	public double calculateAverage() {
		
		return calculateTotal()/3;
	}
	
	public void displayResult() {
		
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("chemistry = " + chemistry);
		System.out.println("maths = " + maths);
		System.out.println("physics = " + physics);
		System.out.println("Total = " + calculateTotal());
		System.out.println("Average = " + calculateAverage());
	}

	public static void main(String[] args) {
		
		Student s = new Student(1,"Simba",10, 10, 6);
		s.displayResult();
		
	}

}
