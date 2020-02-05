package com.cos.springBaseball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.springBaseball.dto.ResponseDetailDto;
import com.cos.springBaseball.dto.ResponsePlayerDto;
import com.cos.springBaseball.dto.ResponseTeamDto;
import com.cos.springBaseball.repository.BaseballRepository;

@Controller
public class Baseballcontroller {
	
	@Autowired
	private BaseballRepository baseballRepository;
	
	@GetMapping({ "", "/" })
	public String Baseball(Model model) {
		List<ResponseTeamDto> teams = baseballRepository.TeamAll();

		model.addAttribute("teams", teams);

		return "/baseball";
	}
	@GetMapping("/api/playerAll/{teamId}")
	public ResponseEntity<?> playerAll(@PathVariable int teamId){
		System.out.println("왔냐");
		List<ResponsePlayerDto> players = baseballRepository.playerByTeamId(teamId);
		
		return new ResponseEntity<List<ResponsePlayerDto>>(players,HttpStatus.CREATED);
	}
	
	@GetMapping("/api/playerDetail/{playerId}")
	public ResponseEntity<?> playerDetail(@PathVariable int playerId){
		System.out.println("왔냐22");
		ResponseDetailDto player = baseballRepository.findByid(playerId);
		
		return new ResponseEntity<ResponseDetailDto>(player,HttpStatus.CREATED);
	}

}
