package com.hand.dao;

import com.hand.model.Film;

public interface FilmDao {
        public Boolean insert(Film film);
        public Film selectById(int id);
        public int selectId();
        public void deleteFilm(int deleteFilm);


}
