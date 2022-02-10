package com.patika.paycore.test.controller;

import com.patika.paycore.test.model.Cinema;
import com.patika.paycore.test.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {


    @Autowired
    private CinemaService cinemaService;

    @GetMapping(path = "/hello")
    public String hello() {
        return " Hello Patika";
    }

    @GetMapping(path = "/all")
    public List<Cinema> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }

    @PostMapping (path = "/get")
    public Cinema getCinema(@RequestParam Integer id) {
        return cinemaService.getCinema(id);

    }

    @PostMapping (path = "/add")
    public boolean addCinema(@RequestBody Cinema cinema) {
        return cinemaService.addCinema(cinema);
    }

    @PutMapping(value = "/update")
    public Cinema updateCinema(@RequestBody Cinema cinema){
        return cinemaService.updateCinema(cinema);
    }
    @DeleteMapping(value = "/delete")
    public boolean deleteCinema(@RequestParam Integer id){
        return cinemaService.deleteCinema(id);
    }
}
