package com.cos.springBaseball.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Team {
	private int id;
	private String name;
	private String year;
	
	@Builder
	public Team(String name, String year) {

		this.name = name;
		this.year = year;
	}
	
}
