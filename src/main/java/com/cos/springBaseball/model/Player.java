package com.cos.springBaseball.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Player {
	private int id;
	private String name;
	private String teamId;
	
	@Builder
	public Player(String name, String teamId) {

		this.name = name;
		this.teamId = teamId;
	}
}
