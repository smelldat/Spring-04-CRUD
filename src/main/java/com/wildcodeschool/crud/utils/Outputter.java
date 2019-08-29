package com.wildcodeschool.crud.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.crud.entities.VideoGame;
import com.wildcodeschool.crud.repositories.VideoGameRepository;


@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Wilder :");

    @Autowired
    private VideoGameRepository videoGameDAO;

    @Override
    public void run(String... args) throws Exception {

        LOG.info("******************");
        LOG.info("Objects in DB : " + videoGameDAO.count());

        VideoGame lol = new VideoGame("League of Legend", "Riot", 2009);
        LOG.info("******************");
        LOG.info(lol + " has been created !");

        VideoGame gow = new VideoGame("God of War 4", "Santa Monica Studio", 2018);
        LOG.info("******************");
        LOG.info(lol + " has been created !");

        videoGameDAO.save(lol);
        videoGameDAO.save(gow);
        LOG.info("******************");
        LOG.info(lol + " has been saved !");
        LOG.info("******************");
        LOG.info(gow + " has been saved !");

        LOG.info("******************");
        LOG.info("Objects in DB : " + videoGameDAO.count());

        LOG.info("******************");
        LOG.info("Users in list are");


        videoGameDAO.delete(gow);
        LOG.info(gow.getName() + " has been deleted !");

        lol.setName("Riot Games");
        videoGameDAO.save(lol);
        LOG.info(lol.getName() + " has been updated !");

        LOG.info("******************");
        LOG.info("Users in list are");
        
    }
}
