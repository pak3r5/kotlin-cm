package com.cinepolis.cinemamaster.repository

import com.cinepolis.cinemamaster.model.Type
import org.springframework.data.mongodb.repository.MongoRepository

interface TypeRepository : MongoRepository<Type, String> {
}