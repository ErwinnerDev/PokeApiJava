package com.mito.webflux2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mito.webflux2.model.DetallePokemon;
import com.mito.webflux2.service.ServicePokemon;

@RestController
@RequestMapping("/pokemon")
public class ControllerPokemon {
	
	@Autowired
	private ServicePokemon servicePokemon;
	
	@GetMapping
	public ResponseEntity<List<DetallePokemon>> getAllPokemon(){
		List<DetallePokemon> apiPokemon = servicePokemon.getApiPokemon();
		if(apiPokemon.size()>0) { //Esto se deberpai de vañidar dese eñ Sercices * pendiente (con el Optinal? ver los videos de Java-React)
			return new ResponseEntity<List<DetallePokemon>>(apiPokemon,HttpStatus.OK);
		}
		return new ResponseEntity<List<DetallePokemon>>(apiPokemon,HttpStatus.NO_CONTENT);
		
	
	}
	

}
