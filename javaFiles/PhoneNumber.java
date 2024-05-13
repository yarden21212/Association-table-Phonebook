/*
 * PhoneNumber class represents a phone number of a contact.
 */
public class PhoneNumber {
	
	private String number;
	
	public PhoneNumber() {
	}
	public PhoneNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String toString() {
		
		return " Number: " + number;
	}
	public String getInformation() {
		return "Number: " + number;
	}
}
