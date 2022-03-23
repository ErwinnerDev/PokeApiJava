package com.mito.webflux2.client.imp;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.mito.webflux2.client.IClientPokemon;
import com.mito.webflux2.model.DetallePokemon;

import java.util.Arrays;
import java.util.List;

@Component
public class ClientPokemon implements  IClientPokemon{
	
	// esta es la API externa a consumir
	private final String urlApi="https://pokeapi.co/api/v2/pokemon";
	
	
	public List<DetallePokemon> getApiPokemon(){
		RestTemplate restTemplate = new RestTemplate();// ya está implenetadop en spring la propiedad* RestTemplate
		//se letiene que pasara una clase que cumpla con el obj JSON para que se pueda mappear
		DetallePokemon forObject = restTemplate.getForObject(urlApi+"/1", DetallePokemon.class);
		System.out.println(forObject);
		return Arrays.asList(forObject);
	}
	

}
