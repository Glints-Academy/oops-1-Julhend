package Assesment;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;

	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
	}

	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

//	public boolean addCourse(String course) {
//
//	}

//	public boolean removeCourse(String course) {
//
//	}

}