package com.cinepolis.cinemamaster.services

import com.cinepolis.cinemamaster.model.Country
import com.cinepolis.cinemamaster.repository.CountryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CountryService: CountryRepository {
    @Autowired
    lateinit var countryRepository: CountryRepository

    override fun createCountry(country: Country) = countryRepository.createCountry(country)

    override fun readCountry() = countryRepository.readCountry()

    override fun updateCountry(uuid: String, country: Country) = countryRepository.updateCountry(uuid,country)

    override fun deleteCountry(uuid: String) = countryRepository.deleteCountry(uuid)

}