package com.sasank.java2025.random;
import java.util.Scanner;
public class Student {
	
	private int id;
	private String name;
	private int maths,physics,chemistry;
	
//	public Student(int id, String name, int maths, int physics, int chemistry) {
//		this.id = id;
//		this.name = name;
//		this.chemistry = chemistry;
//		this.maths = maths;
//		this.physics = physics;
//	}
	public Student() {
	}
	public void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter maths : ");
		int maths = sc.nextInt();
		System.out.println("Enter physics : ");
		int physics = sc.nextInt();
		System.out.println("Enter chemistry : ");
		int chemistry = sc.nextInt();
	}
	
	public double calculateTotal() {
		
		return maths+physics+chemistry;
	}
	
	public double calculateAverage() {
		
		return calculateTotal()/3.0;
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
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter id : ");
//		int id = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter maths : ");
//		int maths = sc.nextInt();
//		System.out.println("Enter physics : ");
//		int physics = sc.nextInt();
//		System.out.println("Enter chemistry : ");
//		int chemistry = sc.nextInt();
	
		Student s = new Student();
		s.readInput();
		s.displayResult();
	}

}
