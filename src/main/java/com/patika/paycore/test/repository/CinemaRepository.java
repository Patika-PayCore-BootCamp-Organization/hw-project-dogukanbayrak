package com.patika.paycore.test.repository;


import com.patika.paycore.test.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
}
