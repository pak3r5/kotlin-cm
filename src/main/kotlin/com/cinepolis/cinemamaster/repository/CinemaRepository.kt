package com.cinepolis.cinemamaster.repository

import com.cinepolis.cinemamaster.model.Cinema
import org.springframework.data.mongodb.repository.MongoRepository

interface CinemaRepository: MongoRepository<Cinema, String> {
}