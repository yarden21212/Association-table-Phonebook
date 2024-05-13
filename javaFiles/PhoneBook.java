/*
 * PhoneBook class represents a "full" contact on a phone book with name, surname and phone-number.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class PhoneBook {
	
	private TreeMap<Contact, PhoneNumber> map;
	
	public PhoneBook() {
		map = new TreeMap<Contact, PhoneNumber>();
	}
	public PhoneBook(Contact[] contacts, PhoneNumber[] numbers) throws IllegalArgumentException {
		
		
		if(contacts.length != numbers.length) {
			throw new IllegalArgumentException();
		}
		
		map = new TreeMap<>();
		for(int i = 0; i < contacts.length; i++) {
			
			if(map.containsKey(contacts[i])) {
				map.remove(contacts[i]);
			}
			map.put(contacts[i], numbers[i]);
		}
		
	}
	public void add(Contact contact, PhoneNumber number) {
		
		map.put(contact, number);
	}
	public void remove(Contact contact) {
		if(map.containsKey(contact)) {
			map.remove(contact);
		}
	}
	//I keep this method so I can study this later, you can ignore, i'm not sure how it works yet
	public Iterator iterator() {
		
		return map.keySet().iterator();
	}
	public String toString() {
		
		return map.toString();
	}
	public String getInformation() {
		
		String print = "";
		ArrayList<Contact> tempContacts = new ArrayList<>();
		ArrayList<PhoneNumber> tempNumbers = new ArrayList<>();
		
		for (Contact key : map.keySet()) {
		      tempContacts.add(key);
		 }
		for (PhoneNumber value : map.values()) {
			tempNumbers.add(value);
	    }
		for(int i = 0; i < tempContacts.size(); i++) {
			print += tempContacts.get(i).getInformation() + ", " + tempNumbers.get(i).getInformation() + "\n";
		}
		
		return print;
	}
	public TreeMap<Contact, PhoneNumber> getPhoneBook() {
		return map;
	}
}
