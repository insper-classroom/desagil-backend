package br.edu.insper.desagil.backend.model;

import java.util.List;

public class Series extends Collection {
	private List<Episode> episodes;
	
	public Series(String title, List<Episode> episodes) {
		super(title);
	}
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void seasonRating(Episode season) {
		for (int ratings: this.(season)) {
			
		}
	
	}

}
