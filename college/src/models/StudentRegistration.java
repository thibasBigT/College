package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import students.GraduateStudent;
import students.PostgGraduateStudent;

public class StudentRegistration {
	private ArrayList<Student> graduateStudents = new ArrayList<>();
	private ArrayList<Student> postGraduateStudent = new ArrayList<>();
	private HashMap<String, Student> students = new HashMap<>();

	public void registerStudent(String name, int curso) {
		Student newStudent;
		String studentKey = generateRegistration();
		switch (curso) {

		case 0:
			newStudent = new GraduateStudent(name, studentKey);
			this.graduateStudents.add(newStudent);
			this.students.put(studentKey, newStudent);

			System.out.println("Registration success!!!!");
			System.out.println(students.get(studentKey).getName());
			System.out.println(students.get(studentKey).getRegistration());
			break;
		case 1:
			newStudent = new PostgGraduateStudent(name, studentKey);
			this.postGraduateStudent.add(new PostgGraduateStudent(name, generateRegistration()));
			this.students.put(studentKey, newStudent);

			System.out.println("Registration success!!!!");
			System.out.println("Name registered: " + students.get(studentKey).getName());
			System.out.println("Registration number:" + students.get(studentKey).getRegistration());
			break;
		}

	}

	private String generateRegistration() {
		String registration;
		do {
			registration = String.valueOf(new Random().nextInt(10000));
		} while (students.containsKey(registration));
		return registration;
	}

	public void displayAllStudents() {
		for (String studant : students.keySet()) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("----------------------------------------------------------------");
			System.out.println("-                      INFORMATIONS                            -");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Studant name: " + this.students.get(studant).getName());
			System.out.println("Registration: " + this.students.get(studant).getRegistration());
			System.out.println("----------------------------------------------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}

	public void searchStudent(String registration) {
		System.out.println(students.get(registration).getName());

	}

	public void displayStudent(String registration) {
		students.get(registration).displayInfo();

	}

	public void putGrades(String registration, int grade1, int grade2) {
		students.get(registration).recordGrades(grade1, grade2);
		;
	}

}
