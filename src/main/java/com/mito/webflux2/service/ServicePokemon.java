package com.mito.webflux2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mito.webflux2.client.IClientPokemon;
import com.mito.webflux2.model.DetallePokemon;

@Service
public class ServicePokemon {
	
	@Autowired
	private IClientPokemon ClientPokemon;
	
	public List<DetallePokemon> getApiPokemon(){ // aqui se debería de hacer las validacioens si hat algúbn error
		return ClientPokemon.getApiPokemon();
	}


}
