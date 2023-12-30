package com.devhenrique.dsmovie.modelmapper;

import org.springframework.stereotype.Component;

import com.devhenrique.dsmovie.dto.MovieDTO;
import com.devhenrique.dsmovie.entity.Movie;

@Component
public class MovieMapper {
	
	
	public MovieDTO toDTO(Movie entity) {
		return new MovieDTO(entity.getId(), entity.getTitle(), entity.getScore(), entity.getCount(), entity.getImage());
	}
	
	public Movie fromDTO(MovieDTO dto) {
		return new Movie(dto.getId(), dto.getTitle(), dto.getScore(), dto.getCount(), dto.getImage());
	}
}
