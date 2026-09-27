class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available: " + title);
        }
    }
    
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }
}

class Library {
    private Book[] books;
    private int bookCount;
    
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }
    
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full");
        }
    }
    
    public void displayBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getTitle() + " by " + books[i].getAuthor() + 
                             " - " + (books[i].isAvailable() ? "Available" : "Borrowed"));
        }
    }
    
    public void borrowBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].borrow();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
    
    public void returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library(5);
        
        library.addBook(new Book("Java Programming", "John Doe"));
        library.addBook(new Book("Python Basics", "Jane Smith"));
        library.addBook(new Book("Data Structures", "Alice Johnson"));
        
        library.displayBooks();
        
        library.borrowBook("Java Programming");
        library.borrowBook("Python Basics");
        
        library.displayBooks();
        
        library.returnBook("Java Programming");
        
        library.displayBooks();
    }
}
