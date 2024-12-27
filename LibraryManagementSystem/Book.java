package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private boolean isCheckedOut = false;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    // Methods to check out and return the book
    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    @Override
    public String toString() {
        String status = isCheckedOut ? "Checked Out" : "Available";
        return "Title: " + title + ", Author: " + author + ", Status: " + status;
    }
}
