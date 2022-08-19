package ru.netology.poster;

import ru.netology.repository.PosterRepository;

public class PosterManager {

    private PosterRepository repo;
    private int requiredLength;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
        requiredLength = 10;
    }

    public void add(Films film) {
        repo.save(film);
    }

    public PosterManager(PosterRepository repo, int requiredLength) {
        this.repo = repo;
        this.requiredLength = requiredLength;
    }

    public Films[] findLast() {

        Films[] all = repo.findAll();

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
