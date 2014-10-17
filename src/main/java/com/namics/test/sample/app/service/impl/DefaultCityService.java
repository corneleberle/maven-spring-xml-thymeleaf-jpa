package com.namics.test.sample.app.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namics.test.sample.app.builder.CityBuilder;
import com.namics.test.sample.app.model.City;
import com.namics.test.sample.app.repository.CityRepository;
import com.namics.test.sample.app.service.CityService;

@Service
public class DefaultCityService implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> getCities() {
		List<City> cities = new ArrayList<City>();

		Iterator<City> iterator = cityRepository.findAll().iterator();
		while (iterator.hasNext()) {
			cities.add(iterator.next());
		}

		if (cities.isEmpty()) {
			cities = createCities();
		}

		return cities;
	}

	private List<City> createCities() {
		List<City> cities = new ArrayList<City>();

		cities.add(cityRepository.save(new CityBuilder().name("Rome").population(1000000).build()));
		cities.add(cityRepository.save(new CityBuilder().name("St. Gallen").population(200000).build()));
		cities.add(cityRepository.save(new CityBuilder().name("New York").population(5000000).build()));

		return cities;
	}
}
