package com.devhenrique.dsmovie.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhenrique.dsmovie.dto.MovieDTO;
import com.devhenrique.dsmovie.service.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	private final MovieService movieService;
	
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findAll(Pageable pageable) {
		return ResponseEntity.ok().body(movieService.findAll(pageable));
	}
}
