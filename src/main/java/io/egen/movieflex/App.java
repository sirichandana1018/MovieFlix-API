package io.egen.movieflex;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import io.egen.movieflex.entity.Movies;

public class App {

	public static void main(String[] args) {

		Gson gson = new Gson();
		List<Movies> movieList = new ArrayList<>();
		try (Reader reader = new FileReader("D:\\movielist.json")) {

			// Convert JSON to Java Object
			Movies[] movie = gson.fromJson(reader, Movies[].class);
			
			for(Movies m: movie){
				movieList.add(m);
			}
		//	System.out.println(Arrays.toString(movie));
			System.out.println(movieList);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
