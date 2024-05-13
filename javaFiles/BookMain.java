/*
 * Main for the PhoneBook to test stuff
 */
public class BookMain {
	public static void main(String[] args) {
		
		Contact[] contacts = new Contact[3];
		PhoneNumber[] numbers = new PhoneNumber[3];
		contacts[0] = new Contact("Ron", "Soval");
		contacts[1] = new Contact("Bon", "Sival");
		contacts[2] = new Contact("Gon", "Svaaaaa");
		numbers[0] = new PhoneNumber("123456678");
		numbers[1] = new PhoneNumber("542342142");
		numbers[2] = new PhoneNumber("215124421");
		PhoneBook book = null;
		
		try {
			book = new PhoneBook(contacts, numbers);
		} catch (IllegalArgumentException e) {
			//Default message
		}
		
		System.out.println(book);
	}
}
