package com.github.rlourenco1998.citiesapi.countries.repository;

import com.github.rlourenco1998.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
