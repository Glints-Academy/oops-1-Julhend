package Assesment;

public class Student extends Person {

	private int numCourses;
	private String[] courses;
	private int[] grades;

	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString();
	}

	public void addCourseGrade(String course, int grade) {

	}

	public void printGrades() {

	}

//	public double getAverageGrade() {
//	
//
//	}
}