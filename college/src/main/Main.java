package main;
// made by Thiago Temoteo da Silva

import java.util.Scanner;
import models.StudentRegistration;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StudentRegistration studantManager = new StudentRegistration();

		String entry1;
		int entry2;
		int entry3;
		int choice = 0;

		do {
			System.out.println("================================");
			System.out.println("|           WELCOME            |");
			System.out.println("================================");
			System.out.println("1. Register a Student");
			System.out.println("2. Show all Students");
			System.out.println("3. Search for a Student");
			System.out.println("4. Show a only one Student Information");
			System.out.println("5. Record a student's grades ");
			System.out.println("6. Exit");

			System.out.print("Choose an option: ");
			choice = Integer.parseInt(input.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter the student's name: ");
				entry1 = input.nextLine();

				System.out.println("Write [0] for undergraduate student or [1] for postgraduate student");
				entry2 = Integer.parseInt(input.nextLine());

				studantManager.registerStudent(entry1, entry2);
				break;

			case 2:
				studantManager.displayAllStudents();
				break;

			case 3:
				System.out.println("Enter student key");
				entry1 = input.nextLine();

				studantManager.searchStudent(entry1);
				break;

			case 4:
				System.out.println("Enter student key");
				entry1 = input.nextLine();

				studantManager.displayStudent(entry1);
				break;

			case 5:
				System.out.println("Enter the student key");
				entry1 = input.nextLine();

				System.out.println("Enter grade 1");
				entry2 = Integer.parseInt(input.nextLine());

				System.out.println("Enter grade 2");
				entry3 = Integer.parseInt(input.nextLine());

				studantManager.putGrades(entry1, entry2, entry3);
				break;
			}

		} while (choice != 6);

		input.close();
	}
}