package com.devhenrique.dsmovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devhenrique.dsmovie.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
