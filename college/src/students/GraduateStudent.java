package students;

import models.Student;

public class GraduateStudent extends Student {

	public GraduateStudent(String name, String registration) {
		super(name, registration);
	}

	@Override
	public double calculateAverage(double grade1, double grade2) {
		return (grade1 + grade2 / 2);
	}

}