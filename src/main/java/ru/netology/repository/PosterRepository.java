package ru.netology.repository;

import ru.netology.poster.Films;

public class PosterRepository {

    private Films[] films = new Films[0];

    public void save(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films findById (int id) {
        Films requireFilm = null;
        for (Films film : films) {
            if (film.getFilmId() == id) {
                requireFilm = film;
            }
        }
        return requireFilm;
    }

    public Films[] removeById(int id) {
        Films[] tmp = new Films[films.length - 1];
        int copyToIndex = 0;
        for (Films film : films) {
            if (film.getFilmId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
        return tmp;
    }

    public Films[] removeAll() {
        Films[] empty = new Films[0];
        films = empty;
        return films;
    }
}
