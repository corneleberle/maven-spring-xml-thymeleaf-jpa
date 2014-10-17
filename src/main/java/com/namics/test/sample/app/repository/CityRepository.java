package com.namics.test.sample.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.namics.test.sample.app.model.City;

public interface CityRepository extends CrudRepository<City, Long> {

}
