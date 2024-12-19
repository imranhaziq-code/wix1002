package VIVA2;

import java.util.Scanner;

public class V2Q3b {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        // Arrays to store book titles and authors
        String[] books = new String[10];  // Array for up to 10 books
        String[] authors = new String[10]; // Array for up to 10 authors
        int bookCount = 0;  // Keeps track of the number of books in the system

        do {
            // Display menu
            System.out.println("\nChoose an action:");
            System.out.println("1. Add a book");
            System.out.println("2. View book details");
            System.out.println("3. View all books");
            System.out.println("4. Exit");
            System.out.println("Choice of action: ");
            choice = keyboard.nextInt();
            keyboard.nextLine(); // Consume the leftover newline

            switch (choice) {
                case 1: // Add a book
                    if (bookCount < books.length) {
                        System.out.print("Enter book title: ");
                        String title = keyboard.nextLine();
                        System.out.print("Enter book author: ");
                        String author = keyboard.nextLine();
                        books[bookCount] = title;
                        authors[bookCount] = author;
                        bookCount++; // Increment book count

                    } else {
                        System.out.println("Cannot add more books. Library is full.");
                    }
                    break;

                case 2: // View book details
                    System.out.print("Enter book title: ");
                    String title = keyboard.nextLine();
                    boolean found = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equalsIgnoreCase(title)) {
                            System.out.println("Book Details: " + books[i] + " by " + authors[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3: // View all books
                    if (bookCount == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("List of all books:");
                        for (int i = 0; i < bookCount; i++) {
                            System.out.println(books[i] + " by " + authors[i]);
                        }
                    }
                    break;

                case 4: // Exit
                    System.out.println("Program ending...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);

        keyboard.close();
    }
}
