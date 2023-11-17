package com.devsuperior.dslist.entities;

public class Game {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String logDescription;
	
	public Game() {
	}
	
	public Game(Long id, String title, Integer year, String genre, String platforms,
			    Double score, String imgUrl, String shortDescription, String logDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.logDescription = logDescription;
	}
	
	
	
}
