package com.hand.test;

import com.hand.model.Film;
import com.hand.service.impl.FilmServiceImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

  public static void main(String[] args) {
    ApplicationContext act = new ClassPathXmlApplicationContext("ApplicationContext-mybatis.xml");
    System.out.println("Context Start");
    FilmServiceImpl filmService = (FilmServiceImpl) act.getBean("filmService");

    Film film = new Film();
    Scanner scanner = new Scanner(System.in);
    String title;
    String description;
    int languageId;
    String last_update;

      System.out.println("请输入title");
      title = scanner.next();
      System.out.println("请输入description");
      description = scanner.next();
      System.out.println("请输入languageId");
      languageId = scanner.nextInt();


            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //设置日期格式
            last_update = df.format(new Date());

            film.setTitle(title);
            film.setDescription(description);
            film.setLanguage_id(languageId);
            film.setLast_update(last_update);
            filmService.insert(film);
            System.out.println("Context stop");


        }

    }
