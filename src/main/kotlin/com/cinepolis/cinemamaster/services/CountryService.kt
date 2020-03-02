package com.cinepolis.cinemamaster.services

import com.cinepolis.cinemamaster.model.Country
import com.cinepolis.cinemamaster.repository.CountryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CountryService {
    @Autowired
    lateinit var countryRepository: CountryRepository

    fun createCountry(country: Country) = countryRepository.insert(country)

    fun readCountry() = countryRepository.findAll()

    fun updateCountry(id: String, country: Country): Country {
        return if(countryRepository.findById(id)!=null) {
            countryRepository.save(country)
        }
        else{ throw object: Exception("Country not found"){} }
    }

    fun deleteCountry(id: String) {
            return if(countryRepository.findById(id)!=null) {
                countryRepository.deleteById(id)
            }
            else{ throw object: Exception("Country not found"){} }
    }

    fun findById(id:String): Optional<Country> {
        var country = countryRepository.findById(id);
        if(country!=null) {
            return country
        }
        else{ throw object: Exception("Country not found"){} }
    }

}