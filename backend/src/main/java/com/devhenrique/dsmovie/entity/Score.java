package com.devhenrique.dsmovie.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devhenrique.dsmovie.entity.pk.ScorePK;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double amount;
	
	public Score() { }

	public Score(User userId, Movie movieId, Double amount) {
		super();
		this.id.setUser(userId);
		this.id.setMovie(movieId);
		this.amount = amount;
	}
	
	public Movie getMovie() {
		return this.getMovie();
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public User getUser() {
		return this.getUser();
	}

	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(id, other.id);
	}
}
