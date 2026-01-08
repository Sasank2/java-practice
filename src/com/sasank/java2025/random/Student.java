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
	
<<<<<<< HEAD
=======
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
		double Avg = calculateAverage();
		if(Avg >= 90) {
			grade = 'A';
		}else if(Avg < 90 && Avg >= 70) {
			grade = 'B';
		}else if(Avg < 70) {
			grade = 'F';
		}
		return grade;
	}
	
>>>>>>> 990274a ( Fix grade calculation and improve output labels)
	public void displayResult() {
		
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("chemistry = " + chemistry);
		System.out.println("maths = " + maths);
		System.out.println("physics = " + physics);
		System.out.println("Total = " + calculateTotal());
		System.out.println("Average = " + calculateAverage());
<<<<<<< HEAD
=======
		System.out.println("Grade = " + calculateGrade());
>>>>>>> 990274a ( Fix grade calculation and improve output labels)
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
<<<<<<< HEAD
		s.readInput();
=======
		
>>>>>>> 990274a ( Fix grade calculation and improve output labels)
		s.displayResult();
	}

}
