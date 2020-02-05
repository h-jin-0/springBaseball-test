package com.cos.springBaseball.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTeamDto {
	private int id;
	private String name;
	private String year;
	
}
