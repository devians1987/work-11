import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager cinema = new MovieManager();

    Movie film1 = new Movie(1, "Бладшот", "Боевик");
    Movie film2 = new Movie(2, "Вперед!", "Мультфильм");
    Movie film3 = new Movie(3, "Отель Белград", "Комедия");
    Movie film4 = new Movie(4, "Джентельмены", "Боевик");
    Movie film5 = new Movie(5, "Человек Невидимка", "Ужасы");
    Movie film6 = new Movie(6, "Тролли.Мировой тур", "Мульфильм");
    Movie film7 = new Movie(7, "Номер один", "Комедия");

    @BeforeEach
    public void setup() {
        cinema.addMovie(film1);
        cinema.addMovie(film2);
        cinema.addMovie(film3);
        cinema.addMovie(film4);
        cinema.addMovie(film5);
        cinema.addMovie(film6);
        cinema.addMovie(film7);
    }

    @Test
    public void testAddMovie() {

        Movie[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Movie[] actual = cinema.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutLimit() {

        Movie[] expected = {film7, film6, film5, film4, film3};
        Movie[] actual = cinema.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWithLimit() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);

        Movie[] expected = {film6, film5, film4};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastWithLimit2() {
        MovieManager manager = new MovieManager(6);
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);

        Movie[] expected = {film4, film3, film2,film1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}

