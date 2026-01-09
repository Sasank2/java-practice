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
<<<<<<< Updated upstream

=======
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> origin/master
>>>>>>> Stashed changes
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
<<<<<<< HEAD
		double Avg = calculateAverage();
		if(Avg >= 90) {
			grade = 'A';
		}else if(Avg < 90 && Avg >= 70) {
			grade = 'B';
		}else if(Avg < 70) {
=======
		if(calculateAverage() >= 90) {
			grade = 'A';
		}else if(calculateAverage() < 90 || calculateAverage() >= 70) {
			grade = 'B';
		}else if(calculateAverage() < 70) {
>>>>>>> origin/master
			grade = 'F';
		}
		return grade;
	}
	
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
>>>>>>> 990274a ( Fix grade calculation and improve output labels)
=======
>>>>>>> origin/master
>>>>>>> Stashed changes
	public void displayResult() {
		
		readInput();
		System.out.println("id = " + this.id);
		System.out.println("name = " + name);
		System.out.println("chemistry = " + chemistry);
		System.out.println("maths = " + maths);
		System.out.println("physics = " + physics);
		System.out.println("Total = " + calculateTotal());
		System.out.println("Average = " + calculateAverage());
<<<<<<< Updated upstream
		System.out.println("Grade = " + calculateGrade());
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
		System.out.println("Grade = " + calculateGrade());
>>>>>>> 990274a ( Fix grade calculation and improve output labels)
=======
		System.out.println("Average = " + calculateGrade());
>>>>>>> origin/master
>>>>>>> Stashed changes
	}

	public static void main(String[] args) {
		Student s = new Student();
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
<<<<<<< HEAD
		s.readInput();
=======
		
>>>>>>> 990274a ( Fix grade calculation and improve output labels)
=======
>>>>>>> origin/master
>>>>>>> Stashed changes
		s.displayResult();
	}

}
