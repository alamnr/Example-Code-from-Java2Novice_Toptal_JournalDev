package com.java2novice.beans;

public class Article {
	private String title;
	private int number;
	private String body;
	
	public Article(String title, int number){
		this.title = title;
		this.number = number;
	}
	
	public Article(String title, String body){
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", number=" + number + ", body=" + body + "]";
	}
	
	

}
