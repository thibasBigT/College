package students;

import models.Student;

public class PostgGraduateStudent extends Student {

	public PostgGraduateStudent(String name, String registration) {
		super(name, registration);
	}

	@Override
	public double calculateAverage(double grade1, double grade2) {
		return (grade1 * 0.40) + (grade2 * 0.60);
	}

}