package com.patika.paycore.test.controller;

import com.patika.paycore.test.model.Cinema;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

    private List<Cinema> cinemas = new ArrayList<>();
    {
        cinemas.add(new Cinema("Cinemaximum"));
        cinemas.add(new Cinema("Cinemapink"));
    }


    @RequestMapping(method = RequestMethod.GET,path ="hello" )
    public String hello(){
        return " Hello Patika";
    }

    @RequestMapping(method = RequestMethod.GET,path ="/all" )
    public List<Cinema> getAllCinemas(){
        return cinemas;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public boolean addCinema(@RequestBody  Cinema cinema) {
        return cinemas.add(cinema);

    }

}
