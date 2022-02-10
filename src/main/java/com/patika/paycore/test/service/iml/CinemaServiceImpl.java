package com.patika.paycore.test.service.iml;

import com.patika.paycore.test.model.Cinema;
import com.patika.paycore.test.repository.CinemaRepository;
import com.patika.paycore.test.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;


    @Override
    public List<Cinema> getAllCinemas() {
        List<Cinema> all = cinemaRepository.findAll();
        return all;
    }

    @Override
    public Cinema getCinema(Integer id) {
        Optional<Cinema> byId =cinemaRepository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public boolean addCinema(Cinema cinema) {
        Cinema save= cinemaRepository.save(cinema);
        if(save == null)
            return  false;
        return true;
    }

    @Override
    public Cinema updateCinema(Cinema cinema) {
        return  cinemaRepository.save(cinema);
    }

    @Override
    public boolean deleteCinema(Integer id) {
        cinemaRepository.deleteById(id);
        return true;

    }
}
