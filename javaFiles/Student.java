/*
 * Student class represents a student object with name, surname, id and year of birth.
 * We will use it as an object for the table we created
 */
public class Student implements Comparable<Student>{

	private String name, surname, id;
	private int yearOfBirth;
	
	public Student(String name, String surname, String id, int yearOfBirth) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public boolean equals(Student other) {
		if(this.id.equals(other.id)) {
			return true;
		}
		return false;
	}
	public String toString() {
		String print = "";
		
		print += "\nName: " + name;
		print += "\nSurname: " + surname;
		print += "\nID: " + id;
		print += "\nYear of birth: " + yearOfBirth;
		
		return print;
	}

	@Override
	public int compareTo(Student other) {
		if(this.id.compareTo(other.id) < 0) {
			return -1;
		}
		if(this.id.equals(other.id)) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
