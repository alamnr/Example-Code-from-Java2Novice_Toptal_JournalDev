package com.redhat.developers.Item_1;

import com.google.common.base.Preconditions;

public class Person {
	
	private String title;
	
	private final String name;
	
	private final String surName;
	
	private String prefix;

	private Person(String title, String name, String surName, String prefix) {
		super();
		this.title = title;
		this.name = name;
		this.surName = surName;
		this.prefix = prefix;
	}
	
	public static Builder builder(String name, String surName){
		return new Builder(name, surName);
	}
	
	public static class Builder{
		private String title;
		
		private final String name;
		
		private final String surName;
		
		private String prefix;

		private Builder(String name, String surName) {
			super();
			this.name = name;
			this.surName = surName;
		}
		
		
		
		public Builder title(String title){
			this.title = title;
			return this;
		}
		
		public Builder prefix(String prefix){
			this.prefix = prefix;
			return this;
		}
		
		public Person build(){
			//Preconditions.checkState(title!=null && prefix !=null);
			return new Person(title,name, surName,prefix);
		}
	}
	
	public static void main(String[] args){
		Person person = Person.builder("Nur", "Alam")
		.prefix("Mr.")
		.build();
		
		System.out.println(person);
	}

}
