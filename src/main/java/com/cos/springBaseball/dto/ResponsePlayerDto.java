package com.cos.springBaseball.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePlayerDto {

	private int id;
	private String name;
	private String teamId;


}
