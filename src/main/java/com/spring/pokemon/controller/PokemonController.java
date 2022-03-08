package com.spring.pokemon.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pokemon.service.PokemonService;

@RestController
@RequestMapping(path = "pokemon")
public class PokemonController {
	
	PokemonService pokemonServicez;
	
 @Autowired
	public PokemonController(PokemonService pokemonServices){
		this.pokemonServicez = pokemonServices;
	}
	
/*
	public PokemonController() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	
	@GetMapping(value="/{nombrePokemon}")
	public String AllEndPoint(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicez.imprimirPokemon(pokemon);
	}
	
	
	
	@GetMapping(value="/{nombrePokemon}/abilities")
	public String obtenerAbilities(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicez.obtenerAbilities(pokemon);
	}
	

	@GetMapping(value="/{nombrePokemon}/base_experience")
	public String obtenerBase_experience(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicez.obtenerBaseExperience(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/held_items")
	public String obtenerHeldItems(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicez.obtenerHeld_items(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/id")
	public String obtenerID(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicez.obtenerID(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/name")
	public String obtenerName(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicez.obtenerName(pokemon);
	}
	
	
	@GetMapping(value="/{nombrePokemon}/location_area_encounters")
	public String obtenerLocationAreaeEncounters(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonServicez.obtenerLocationAreaeEncounters(pokemon);
	}
	

	
	

	
	
	
}
