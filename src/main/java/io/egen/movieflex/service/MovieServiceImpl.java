package io.egen.movieflex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.movieflex.entity.Movies;
import io.egen.movieflex.repository.IMovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements IMovieService{

	@Autowired
	private IMovieRepository repository;
	
	@Override
	public void saveAll(Movies[] movieArray) {
		repository.saveAll(movieArray);
	}

	@Override
	public List<Movies> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Movies> getTopRated() {
		return repository.getTopRated();
	}

	@Override
	public List<Movies> getById(String id) {
		return repository.getById(id);
	}

	@Override
	public List<Movies> getRatingsById(String id) {
		return repository.getRatingsById(id);
	}

	@Override
	public List<Movies> getCommentsById(String id) {
		return repository.getCommentsById(id);
	}

}
