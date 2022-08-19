package ru.netology.poster;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    PosterManager poster = new PosterManager();
    Films film1 = new Films("Заноза", "Комедия");
    Films film2 = new Films("Сковородка", "Ужасы");
    Films film3 = new Films("Боевик", "Боевик");
    Films film4 = new Films("Бладшот", "Мультфильм");
    Films film5 = new Films("Капуста", "Ужасы");
    Films film6 = new Films("Блад", "Триллер");
    Films film7 = new Films("Бот", "Мультфильм");
    Films film8 = new Films("Орк", "Мультфильм");
    Films film9 = new Films("Маска", "Комедия");
    Films film10 = new Films("Джек", "Боевик");
    Films film11 = new Films("Нос", "Мультфильм");

    @BeforeEach
    public void setup(){
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        poster.save(film9);
        poster.save(film10);
        poster.save(film11);
    }

    @Test
    public void shouldAddNewFilm() {

        Films[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        Films[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowLastFilms() {
        Films[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Films[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFiveFilms() {
        PosterManager poster = new PosterManager(5);
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        poster.save(film9);
        poster.save(film10);
        poster.save(film11);
        Films[] expected = {film11, film10, film9, film8, film7};
        Films[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilms() {
        PosterManager poster = new PosterManager();
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        Films[] expected = {film5, film4, film3, film2, film1};
        Films[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }
}
