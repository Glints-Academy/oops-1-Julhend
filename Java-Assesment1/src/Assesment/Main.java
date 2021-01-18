package Assesment;

public class Main {
	public static void main(String[] args) {

		Person person1 = new Person("Julhend", "Kijang");
		Student student1 = new Student("Andi", "Tanjung Pinang");
		Teacher teacher1 = new Teacher("Danis", "Batam");
		// print
		System.out.println(person1);
		System.out.println(student1);
		System.out.println(teacher1);

		// test Setter
		person1.setAddress("Tanjung Pinang");
		student1.setAddress("Jakarta 48");
		teacher1.setAddress("Lobam");
		System.out.println("\n----------------test setter--------------");
		System.out.println(person1);
		System.out.println(student1);
		System.out.println(teacher1);
	}
}
