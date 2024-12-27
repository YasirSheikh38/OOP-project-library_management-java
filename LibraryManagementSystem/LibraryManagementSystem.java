package LibraryManagementSystem;


import java.util.Scanner;
import LibraryManagementSystem.Book;
import LibraryManagementSystem.LibraryCatalog;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Search Books by Author");
            System.out.println("4. Check Out Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display All Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    catalog.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    catalog.searchByTitle(searchTitle);
                    break;

                case 3:
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = scanner.nextLine();
                    catalog.searchByAuthor(searchAuthor);
                    break;

                case 4:
                    System.out.print("Enter book title to check out: ");
                    String checkoutTitle = scanner.nextLine();
                    catalog.checkOutBook(checkoutTitle);
                    break;

                case 5:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    catalog.returnBook(returnTitle);
                    break;

                case 6:
                    System.out.println("Books in the catalog:");
                    catalog.displayBooks();
                    break;

                case 7:
                    System.out.println("Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
