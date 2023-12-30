package com.devhenrique.dsmovie.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devhenrique.dsmovie.dto.ScoreDTO;
import com.devhenrique.dsmovie.entity.Movie;
import com.devhenrique.dsmovie.entity.Score;
import com.devhenrique.dsmovie.entity.User;
import com.devhenrique.dsmovie.repository.MovieRepository;
import com.devhenrique.dsmovie.repository.ScoreRepository;
import com.devhenrique.dsmovie.repository.UserRepository;

@Service
public class ScoreService {
	
	private final ScoreRepository scoreRepository;
	private final UserRepository userRepository;
	private final MovieRepository movieRepository;
	
	public ScoreService(ScoreRepository scoreRepository, UserRepository userRepository, MovieRepository movieRepository) {
		this.scoreRepository = scoreRepository;
		this.userRepository = userRepository;
		this.movieRepository = movieRepository;
	}
	
	@Transactional
	public void update(ScoreDTO dto) {
		User user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User(null, dto.getEmail());
			userRepository.saveAndFlush(user);
		}
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		Score score = new Score(user, movie, dto.getScore());
		score = scoreRepository.saveAndFlush(score);
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum = sum + s.getAmount();
		}
		double avg = sum / movie.getScores().size();
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		movieRepository.save(movie);
	}
}
