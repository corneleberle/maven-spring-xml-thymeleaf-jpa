package com.namics.test.sample.app.builder;

import com.namics.test.sample.app.model.City;

public class CityBuilder {

	private City city = new City();

	public CityBuilder name(String name) {
		this.city.setName(name);
		return this;
	}

	public CityBuilder population(int population) {
		this.city.setPopulation(population);
		return this;
	}

	public City build() {
		return this.city;
	}
}
