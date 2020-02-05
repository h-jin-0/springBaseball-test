package com.cos.springBaseball.repository;

import java.util.List;

import com.cos.springBaseball.dto.ResponseDetailDto;
import com.cos.springBaseball.dto.ResponsePlayerDto;
import com.cos.springBaseball.dto.ResponseTeamDto;


public interface BaseballRepository {

	List<ResponseTeamDto> TeamAll();
	
	List<ResponsePlayerDto> playerByTeamId(int id);
	
	ResponseDetailDto findByid(int id);

}
