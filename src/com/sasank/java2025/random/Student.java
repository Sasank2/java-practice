package com.sasank.java2025.random;
import java.util.Scanner;
public class Student {
	
	private int id;
	private String name;
	private int maths,physics,chemistry;
	
	public double calculateTotal() {
		
		return maths+physics+chemistry;
	}
	
	public double calculateAverage() {
		
		return calculateTotal()/3.0;
	}
	
	public void  readInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		this.name = sc.nextLine();
		System.out.println("Enter maths : ");
		this.maths = sc.nextInt();
		System.out.println("Enter physics : ");
		this.physics = sc.nextInt();
		System.out.println("Enter chemistry : ");
		this.chemistry = sc.nextInt();
	}
	public char calculateGrade() {
		char grade = 0;
		if(calculateAverage() >= 90) {
			grade = 'A';
		}else if(calculateAverage() < 90 || calculateAverage() >= 70) {
			grade = 'B';
		}else if(calculateAverage() < 70) {
			grade = 'F';
		}
		return grade;
	}
	
	public void displayResult() {
		
		readInput();
		System.out.println("id = " + this.id);
		System.out.println("name = " + name);
		System.out.println("chemistry = " + chemistry);
		System.out.println("maths = " + maths);
		System.out.println("physics = " + physics);
		System.out.println("Total = " + calculateTotal());
		System.out.println("Average = " + calculateAverage());
		System.out.println("Average = " + calculateGrade());
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.displayResult();
	}

}
