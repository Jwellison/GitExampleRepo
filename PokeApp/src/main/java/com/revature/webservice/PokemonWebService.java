package com.revature.webservice;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Pokemon;
import com.revature.service.PokemonService;

public class PokemonWebService {

	public static void getPokemon(HttpServletRequest request, HttpServletResponse response) {
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		
		Pokemon p = PokemonService.getPokemon(id);
		
		//some code or some logic;
		ObjectMapper om = new ObjectMapper();
		
		try {
			String pokemonJSON = om.writeValueAsString(p);
			response.getWriter().append(pokemonJSON).close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
