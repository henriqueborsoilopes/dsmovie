package com.devhenrique.dsmovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devhenrique.dsmovie.entity.Score;
import com.devhenrique.dsmovie.entity.pk.ScorePK;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
