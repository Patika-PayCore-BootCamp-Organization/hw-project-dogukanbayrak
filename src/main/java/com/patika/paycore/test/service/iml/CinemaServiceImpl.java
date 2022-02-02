package com.patika.paycore.test.service.iml;

import com.patika.paycore.test.model.Cinema;
import com.patika.paycore.test.service.CinemaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class CinemaServiceImpl implements CinemaService {

    private List<Cinema> cinemas = new ArrayList<>();

    {
        cinemas.add(new Cinema("Cinemaximum"));
        cinemas.add(new Cinema("Cinemapink"));
    }


    @Override
    public List<Cinema> getAllCinemas() {
        return cinemas;
    }

    @Override
    public Cinema getCinema(Integer id) {
        return null;
    }

    @Override
    public boolean addCinema(Cinema cinema) {
        return cinemas.add(cinema);
    }

    @Override
    public Cinema updateCinema(String name, Cinema cinema) {
        AtomicBoolean status = new AtomicBoolean(false);
        cinemas.forEach(cinemaItem -> {
            if (cinemaItem.getName() == cinema.getName()) {
                status.set(true);
                cinemaItem.setName(cinema.getName());
            }
        });
        if(status.get())
            return cinema;
        return null;

    }

    @Override
    public boolean deleteCinema(Integer id) {
        return false;
    }
}
