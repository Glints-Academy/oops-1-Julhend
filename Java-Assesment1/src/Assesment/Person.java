package Assesment;

public class Person {

	private String name, address;

	// constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	// setter
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " ( " + address + " ) ";
	}
}