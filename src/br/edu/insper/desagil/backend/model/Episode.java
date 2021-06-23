package br.edu.insper.desagil.backend.model;

import java.util.Map;

public class Episode extends Media{
	private int season;
	
	public Episode (String name, int duration, Map<String, Integer> ratings, int season) {
		super(name,duration);
		this.season = season;
	}
	public int getSeason() {
		return season;
	}
	
	

}
