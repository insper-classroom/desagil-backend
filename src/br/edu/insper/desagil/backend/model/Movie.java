package br.edu.insper.desagil.backend.model;

import java.util.Map;

public class Movie extends Media {
	public Movie(String name, int duration, Map<String, Integer> ratings) {
		super(name,duration);
	}

}
