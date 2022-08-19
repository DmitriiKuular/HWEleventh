package ru.netology.poster;

public class PosterManager {
    private Films[] films = new Films[0];
    private int requiredLength;

    public PosterManager() {
        requiredLength = 10;
    }

    public PosterManager(int requiredLength) {
        this.requiredLength = requiredLength;
    }

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

    public Films[] findLast() {

        Films[] all = findAll();

        int resultLength;
        if (requiredLength < all.length) {
            resultLength = requiredLength;
        } else {
            resultLength = all.length;
        }

        Films[] result = new Films[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }
}
