package com.devhenrique.dsmovie.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devhenrique.dsmovie.dto.MovieDTO;
import com.devhenrique.dsmovie.entity.Movie;
import com.devhenrique.dsmovie.modelmapper.MovieMapper;
import com.devhenrique.dsmovie.repository.MovieRepository;
import com.devhenrique.dsmovie.service.exception.ObjectNotFoundException;

@Service
public class MovieService {
	
	private final MovieRepository movieRepository;
	private final MovieMapper movieMapper;
	
	public MovieService(MovieRepository movieRepository, MovieMapper movieMapper) {
		this.movieRepository = movieRepository;
		this.movieMapper = movieMapper;
	}
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> entitiesPaged = movieRepository.findAll(pageable);
		return entitiesPaged.map(x -> movieMapper.toDTO(x));
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie entity = movieRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("ID invalid! ID: " + id));
		return movieMapper.toDTO(entity);
	}
}
