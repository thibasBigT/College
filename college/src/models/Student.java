package models;

public abstract class Student implements Calculable {
	protected String name;
	protected String registration;
	protected double grade1;
	protected double grade2;
	protected double average;

	public Student(String name, String registration) {
		this.name = name;
		this.registration = registration;
	}

	public String getRegistration() {
		return this.registration;
	}

	public String getName() {
		return this.name;
	}

	public double getNote1() {
		return this.grade1;
	}

	public void setNote1(double note1) {
		this.grade1 = note1;
	}

	public double getNote2() {
		return this.grade2;
	}

	public void setNote2(double note2) {
		this.grade2 = note2;
	}

	public boolean isApproved() {
		if (calculateAverage(this.grade1, this.grade2) >= 7) {
			return true;
		} else {
			return false;
		}
	}

	public void recordGrades(double grade1, double grade2) {
		this.grade1 = grade1;
		this.grade2 = grade2;
	}

	public void displayInfo() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("-                           Info                               -");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Student name: " + this.name);
		System.out.println("Registration: " + this.registration);
		System.out.println("Grade 1: " + this.grade1);
		System.out.println("Grade 2: " + this.grade2);
		System.out.println("Is approved: " + this.isApproved());
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}