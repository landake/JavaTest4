package com.hand.dao.impl;

import com.hand.dao.BaseDao;
import com.hand.dao.FilmDao;
import com.hand.model.Film;
import org.springframework.stereotype.Repository;

@Repository(value = "filmDao")
public class FilmDaoImpl extends BaseDao implements FilmDao {

        @Override
        public Boolean insert(Film film) {
            try {
                this.getSqlSession().insert("film.insert" , film);
            }catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }

        @Override
        public Film selectById(int id) {
            Film film = null;
            try {
                film = this.getSqlSession().selectOne("film.selectById" , id);
            }catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            return film;
        }

        @Override
        public int selectId() {
            int maxId = 0;
            try {
                maxId = this.getSqlSession().selectOne("film.selectId");
            }catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
            return maxId;
        }

        @Override
        public void deleteFilm(int deleteFilm) {
            try {
                this.getSqlSession().selectOne("film.deleteFilm");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

