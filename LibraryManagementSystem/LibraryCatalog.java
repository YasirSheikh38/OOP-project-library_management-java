package LibraryManagementSystem;

import java.util.ArrayList;

public class LibraryCatalog {
    private ArrayList<Book> books;

    // Constructor
    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    // Add a new book to the catalog
    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    // Search for a book by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Search for books by author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Check out a book by title
    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isCheckedOut()) {
                    book.checkOut();
                    System.out.println("Book checked out successfully!");
                } else {
                    System.out.println("Book is already checked out!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return a book by title
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isCheckedOut()) {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not checked out!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Display all books in the catalog
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the catalog!");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
