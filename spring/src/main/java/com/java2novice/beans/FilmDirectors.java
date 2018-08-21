package com.java2novice.beans;

import java.util.List;

public class FilmDirectors {
	
	private List<String> directorList;

	public List<String> getDirectorList() {
		return directorList;
	}

	public void setDirectorList(List<String> directorList) {
		this.directorList = directorList;
	}
	
	public void generateDirectorList(){
		System.out.println(this.directorList);
	}

}
