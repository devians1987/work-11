public class afishaManager {

    private Movie[] movies = new Movie[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int newLimit) {
        this.limit = newLimit;
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++)
            result[i] = movies[movies.length - 1 - i];
        return result;
    }
}

