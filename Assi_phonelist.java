
package com.mycompany.assi_phonelist;


public class Assi_phonelist {

    public static void main(String[] args) {
        phonelist phoneList = new phonelist();
         // Adding contacts
        phoneList.addContact("Alice", "123-456-7890");
        phoneList.addContact("Bob", "987-654-3210");
        phoneList.addContact("Charlie", "555-555-5555");

        // Displaying contacts
        System.out.println("\nDisplaying all contacts:");
        phoneList.displayList();

        // Searching for a contact
        System.out.println("\nSearching for a contact:");
        phoneList.searchContact("Bob");    // Contact found
        phoneList.searchContact("David");  // Contact not found

        // Deleting a contact
        System.out.println("\nDeleting a contact:");
        phoneList.deleteContact("Alice");  // Contact deleted
        phoneList.deleteContact("David");  // Contact not found

        // Displaying contacts after deletion
        System.out.println("\nDisplaying all contacts after deletion:");
        phoneList.displayList();

    }
}
