package com.mito.webflux2.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//Pendiente: @JsonIgnoreProperties investicar que hacer exactamenete 
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetallePokemon {
	
	// La Clase NOO debe de tern cinstructor
	// NO es necesaroio que la clase contenga todos los atribusto de JSON
	// los nombres denlos atributos deben se  exacatamente igual al del JSON
	private Long id;
	private String name;
	private Long height;
	private Long weight;
	private List<Stats> stats;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public List<Stats> getStats() {
		return stats;
	}
	public void setStats(List<Stats> stats) {
		this.stats = stats;
	}

	
	
}
