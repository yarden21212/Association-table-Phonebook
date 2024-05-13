/*
 * PhoneBookGraphicController is the graphic implement of the program.
 * Will create a basic graphic of a phone-book.
 */
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PhoneBookGraphicController {

	private Contact contact;
	private PhoneNumber number;
	private PhoneBook book;
	private boolean isAddPressed;
	
    @FXML
    private TextArea textArea;

    @FXML
    void addPressed(ActionEvent event) throws IllegalArgumentException {
    	
    	isAddPressed = true;
    	getContact("Enter a contact name: ", "Enter a contact surname: "); 	
    	book.add(contact, number);
    	textArea.setText(book.getInformation());
    	isAddPressed = false;
    }
    @FXML
    void removePressed(ActionEvent event) {
    	getContact("Enter a contact name: ", "Enter a contact surname: ");
    	book.remove(contact);
    	textArea.setText(book.getInformation());
    }
    @FXML
    void updatePressed(ActionEvent event) {
    	
    	updateNumber();
    }
    @FXML
    void searchPressed(ActionEvent event) {
    	
    	getContact("Enter a name: ", "Enter a surname: ");
    	String phoneNumber = book.getPhoneBook().get(contact).getNumber();
    	 JOptionPane.showMessageDialog(null, phoneNumber, "THE PHONE NUMBER IS: ", JOptionPane.INFORMATION_MESSAGE);
    }
    private void updateNumber() {
    	getContact("Enter a name: ", "Enter a surname: ");
    	String number = JOptionPane.showInputDialog("Enter new number:");
    	book.getPhoneBook().get(contact).setNumber(number);
    	textArea.setText(book.getInformation());
    }	
    private void getContact(String nameMessage, String surnameMessage) {
    	String name = "", surname = "", number = "";
    	name = JOptionPane.showInputDialog(nameMessage);
    	surname = JOptionPane.showInputDialog(surnameMessage);

    	this.contact = new Contact(name, surname);   
    	
    	if(isAddPressed) {
    		number = JOptionPane.showInputDialog("Enter a contact number: ");
    		this.number = new PhoneNumber(number);
    	}
    
    		
    }
    public void initialize() throws IllegalArgumentException {
    	contact = new Contact();
    	number = new PhoneNumber();
    	book = new PhoneBook();
    	isAddPressed = false;
 
    }

}
