package com.mito.webflux2.client;

import java.util.List;

import com.mito.webflux2.model.DetallePokemon;

public interface IClientPokemon {
	
	public List<DetallePokemon> getApiPokemon();

}
