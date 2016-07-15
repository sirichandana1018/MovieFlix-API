package io.egen.movieflex.repository;

import java.util.List;

import io.egen.movieflex.entity.Movies;

public interface IMovieRepository {

	public void saveAll(Movies[] movieArray);

	public List<Movies> findAll();

	public List<Movies> getTopRated();

	public List<Movies> getById(String id);

	public List<Movies> getRatingsById(String id);

	public List<Movies> getCommentsById(String id);

}
