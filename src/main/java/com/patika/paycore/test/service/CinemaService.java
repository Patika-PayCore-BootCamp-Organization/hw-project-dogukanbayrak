package com.patika.paycore.test.service;

import com.patika.paycore.test.model.Cinema;

import java.util.List;

public interface CinemaService {

    List<Cinema> getAllCinemas();
    Cinema getCinema(Integer id);
    boolean addCinema( Cinema cinema);
    Cinema updateCinema(String name, Cinema cinema);
    boolean deleteCinema(Integer id);



}
