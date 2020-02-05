package com.cos.springBaseball.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDetailDto {
	private int playerId;
	private String playerName;
	private int teamId;
	private String teamName;
	private String year;
}
