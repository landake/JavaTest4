package com.hand.service.impl;

import com.hand.dao.FilmDao;
import com.hand.model.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="filmService")
public class FilmServiceImpl implements FilmService {

    @Autowired
    @Qualifier(value = "filmDao")
    private FilmDao filmDao;

    @Override
    public Boolean insert(Film film) {
        try{
            filmDao.insert(film);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Film selectById(int id) {
        Film customer = null;
        try{
            customer = filmDao.selectById(id);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return customer;
    }

    @Override
    public int selectId() {
        int maxId = 0;
        try {
            maxId = filmDao.selectId();
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return maxId;
    }
    @Override
    public void deleteFilm(int deleteFilm) {
        try {
            filmDao.deleteFilm(deleteFilm);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FilmDao getFilmDao() {
        return filmDao;
    }

    public void setFilmDao(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

}
