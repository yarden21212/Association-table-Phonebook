/*
 * Contact class represents a contact with name and surname.
 * Use to create a full contact which include those + a phone number.
 */
public class Contact implements Comparable<Contact>{
	
	private String name;
	private String surname;
	
	public Contact() {
	}
	public Contact(String name, String surname) {
		this.name = name;
		this.surname = surname;
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
	@Override
	public int compareTo(Contact other) {
		
		if(this.name.equals(other.name)) {
			if(this.surname.equals(other.surname)) {
				return 0;
			}
			else if(this.surname.compareTo(other.surname) > 0) {
				return 1;
			}
			return -1;
		}
		else if(this.name.compareTo(other.name) > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
	public String toString() {
		String print = "";
		print += "\nName: " + name + ", ";
		print += "Surname: " + surname + ", ";
		
		return print;
	}
	public String getInformation() {
		String print = "";
		print += "\nName: " + name + ", ";
		print += "Surname: " + surname;
		
		return print;
	}
}
