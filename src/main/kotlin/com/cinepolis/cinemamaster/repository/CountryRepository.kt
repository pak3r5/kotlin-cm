package com.cinepolis.cinemamaster.repository

import com.cinepolis.cinemamaster.model.Country
import org.springframework.data.mongodb.repository.MongoRepository

interface CountryRepository:MongoRepository<Country,String> {
}