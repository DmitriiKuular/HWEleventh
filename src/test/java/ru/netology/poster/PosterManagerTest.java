package ru.netology.poster;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repository.PosterRepository;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    PosterRepository repo = new PosterRepository();
    PosterManager manager = new PosterManager(repo);

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
    public void setup() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);
    }

    @Test
    public void shouldShowLastFilms() {
        Films[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Films[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastEightFilms() {
        PosterManager manager = new PosterManager(repo, 8);
        Films[] expected = {film11, film10, film9, film8, film7, film6, film5, film4};
        Films[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowSevenAddedFilms() {
        PosterManager manager = new PosterManager(repo);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        Films[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Films[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilms() {
        Films[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        Films[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
}
