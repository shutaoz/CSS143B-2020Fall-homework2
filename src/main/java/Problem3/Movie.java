package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if(obj == null) return false;
        else if(obj.getClass() != this.getClass())  return false;

        return ((Movie)obj).rating.equals(this.rating) && ((Movie)obj).title.equals(this.title) && ((Movie)obj).id.equals(this.id);
    }
}
