package com.hand.service;

import com.hand.model.Film;

public interface FilmService {
    public Boolean insert(Film film);
    public Film selectById(int id);
    public int selectId();
    public void deleteFilm(int deleteFilm);

}
