package com.hand.controller;

import com.hand.model.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilmController {


    @Autowired
    @Qualifier(value = "filmService")
    private FilmService filmService;

    @RequestMapping(value = "/insert")
    public String submit(int film_id , String title  , String description , int languageId, Model model){
        Film film  = new Film();
        film.setFilm_id(film_id);
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguage_id(languageId);

            filmService.insert(film);
            return "info";

    }



    public FilmService getFilmServiceService() {
        return filmService;
    }

    public void setFilmServiceService(FilmService filmService) {
        this.filmService = filmService;
    }
}
