package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;

    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if(obj == null) return false;
        else if(obj.getClass() != this.getClass())  return false;

        return ((Book)obj).title.equals(this.title) && ((Book)obj).author.equals(this.author) && ((Book)obj).id.equals(this.id);
    }
}
