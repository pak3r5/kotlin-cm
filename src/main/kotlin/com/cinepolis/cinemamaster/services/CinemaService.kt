package com.cinepolis.cinemamaster.services

import com.cinepolis.cinemamaster.model.Cinema
import com.cinepolis.cinemamaster.repository.CinemaRepository
import com.cinepolis.cinemamaster.repository.CountryRepository
import com.cinepolis.cinemamaster.repository.TypeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CinemaService {
    @Autowired
    lateinit var cinemaRepository: CinemaRepository
    @Autowired
    lateinit var countryRepository: CountryRepository
    @Autowired
    lateinit var typeRepository: TypeRepository

    fun createCinema(cinema: Cinema) = cinemaRepository.insert(cinema)

    fun readCinema() = cinemaRepository.findAll()

    fun updateCinema(id: String, cinema: Cinema): Cinema {
        return if(cinemaRepository.findById(id)!=null) {
            cinemaRepository.save(cinema)
        }
        else{ throw object: Exception("Cinema not found"){} }
    }

    fun deleteCinema(id: String) {
        return if(cinemaRepository.findById(id)!=null) {
            cinemaRepository.deleteById(id)
        }
        else{ throw object: Exception("Cinema not found"){} }
    }

    fun findById(id:String): Optional<Cinema> {
        var cinema = cinemaRepository.findById(id);
        if(cinema!=null) {
            return cinema
        }
        else{ throw object: Exception("Cinema not found"){} }
    }

}