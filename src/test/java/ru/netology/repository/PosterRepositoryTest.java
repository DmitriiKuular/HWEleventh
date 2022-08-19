package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.poster.Films;

import static org.junit.jupiter.api.Assertions.*;

public class PosterRepositoryTest {

    PosterRepository repo = new PosterRepository();
    Films film1 = new Films(11, "Заноза", "Комедия");
    Films film2 = new Films(22, "Сковородка", "Ужасы");
    Films film3 = new Films(33, "Боевик", "Боевик");
    Films film4 = new Films(44, "Бладшот", "Мультфильм");
    Films film5 = new Films(55, "Капуста", "Ужасы");
    Films film6 = new Films(66, "Блад", "Триллер");
    Films film7 = new Films(77, "Бот", "Мультфильм");
    Films film8 = new Films(88, "Орк", "Мультфильм");
    Films film9 = new Films(99, "Маска", "Комедия");
    Films film10 = new Films(101, "Джек", "Боевик");
    Films film11 = new Films(111, "Нос", "Мультфильм");

    @BeforeEach
    public void setup(){
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
    }

    @Test
    public void shouldShowAddedNewFilms() {

        Films[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        Films[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindFilmById() {
        Films expected = film4;
        Films actual = repo.findById(44);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDeleteFilmById() {
        Films[] expected = {film1, film2, film3, film4, film6, film7, film8, film9, film10, film11};
        Films[] actual = repo.removeById(55);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDeleteAllFilms() {
        Films[] expected = {};
        Films[] actual = repo.removeAll();

        assertArrayEquals(expected, actual);
    }
}