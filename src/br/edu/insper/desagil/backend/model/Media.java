package br.edu.insper.desagil.backend.model;

import java.util.HashMap;
import java.util.Map;

public class Media {
	private String name;
	private int duration;
	private Map<String, Integer> ratings;
	
	public Media(String name, int duration) {
		this.name = name;
		this.duration = duration;
		this.ratings = new HashMap<>();
	}
	
	public String getName() {
		return name;
	}
	public String getDurationString() {
		int minutos=this.duration/60;
		int segundos=this.duration%60;
		
		
		String min=Integer.toString(minutos);
		String seg=Integer.toString(segundos);
		if (segundos<10) {
			seg="0"+seg;
			return min+":"+seg;
		}else {
			return min+":"+seg;
		}
		
	}
	public void putRating(String username, int avaliacao) {
		ratings.put(username,avaliacao);
	}
	public int numberRatings() {
		int n = this.ratings.size();
		return n;
	}
	public double averageRatings() {
		double average = 0;
		int soma=0;
		int n = this.ratings.size();
		
		if (n==0) {
			return 0;
		}
		else if (n!=0) {
			for (int rating:this.ratings.values()) {
				soma+=rating;
			}
			average = soma/(double)n;
		}
		return average;
	}

}
