package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends Collection {
	private User user;
	private List<Movie> movies;
	
	public Playlist (String title, User user) {
		super(title);
		this.user = user;
		this.movies = new ArrayList<>();
	}
	public User getUser() {
		return user;
	}
	public List<Movie> getMovies (){
		return movies;
	}
	public void addMovie(Movie movie) {
		this.movies.add(movie);
		
	}
	

}
