package com.devhenrique.dsmovie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhenrique.dsmovie.dto.ScoreDTO;
import com.devhenrique.dsmovie.service.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	private final ScoreService scoreService;
	
	public ScoreController(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	@PutMapping
	public ResponseEntity<Void> update(@RequestBody ScoreDTO dto) {
		scoreService.update(dto);
		return ResponseEntity.noContent().build();
	}
}
