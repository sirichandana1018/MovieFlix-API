package io.egen.movieflex.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import io.egen.movieflex.entity.Movies;
import io.egen.movieflex.service.IMovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private IMovieService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/getAll")
	public List<Movies> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/getTopRated")
	public List<Movies> getTopRated(){
		return service.getTopRated();
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/getById/{imdbID}")
	public List<Movies> getById(@PathVariable("imdbID") String id){
		return service.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/getRatingsById/{imdbID}")
	public List<Movies> getRatingsById(@PathVariable("imdbID") String id){
		return service.getRatingsById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/getCommentsById/{imdbID}")
	public List<Movies> getCommentsById(@PathVariable("imdbID") String id){
		return service.getCommentsById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/store")
	private String getMoviesFromFile() {
		Gson gson = new Gson();
		Movies[] movieArray;
		try (Reader reader = new FileReader("D:\\movielist.json")) {
			movieArray = gson.fromJson(reader, Movies[].class);
			service.saveAll(movieArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Success";
	}
}
