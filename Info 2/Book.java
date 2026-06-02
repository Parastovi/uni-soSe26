package Übungsblatt6;
import java.time.LocalDate;


public class Book {
    private String title;
    private String author;
    private boolean borrowed = false;
    private LocalDate returnDate = null;


    public Book(String author, String title) {
        setTitle(title);
        setAuthor(author);

    }

    private static boolean checkTitle(String title) {
        return title != null && !title.isEmpty();
    }

    private static boolean checkAuthor(String author) {
        return author != null && !author.isEmpty();
    }

    private void setTitle(String title) {
        if (!checkTitle(title)) {
            throw new IllegalArgumentException("Title must not be empty");
        }
        this.title = title;
    }

    private void setAuthor(String author) {
        if (!checkAuthor(author)) {
            throw new IllegalArgumentException("Author must not be empty");
        }
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public OptionaL<LocalDate> getReturnDate() {
        return Optional.ofNullable(returnDate);

    }

    public void borrow() throws IllegalLoanException {
        if (!isBorrowed()) {
            returnDate = LocalDate.now().plusDays(14);
            borrowed = true;
        } else {
            throw new IllegalLoanException("Object has already been borrowed");
        }
    }

    public void returnThis() throws IllegalLoanException {
        if (borrowed) {
            borrowed = false;
            returnDate = null;
        } else {
            throw new IllegalLoanException("Object has not been borrowed");
        }
    }
    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject.getClass().equals(this.getClass())) {
            Book b = (Book) anObject;
            return this.getTitle().equals(b.getTitle());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return author + ": " + title;
    }

}
