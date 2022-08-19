package ru.netology.poster;

public class Films {
    private String filmName;
    private String filmGenre;
    private int filmId;

    public Films(int filmId, String filmName, String filmGenre) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

//    public String getFilmName() {
//        return filmName;
//    }
//
//    public void setFilmName(String filmName) {
//        this.filmName = filmName;
//    }
//
//    public String getFilmGenre() {
//        return filmGenre;
//    }
//
//    public void setFilmGenre(String filmGenre) {
//        this.filmGenre = filmGenre;
//    }
//
}
