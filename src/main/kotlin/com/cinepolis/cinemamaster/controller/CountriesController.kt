package com.cinepolis.cinemamaster.controller

import com.cinepolis.cinemamaster.model.Country
import com.cinepolis.cinemamaster.services.CountryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class CountriesController {
    @Autowired
    lateinit var countryService: CountryService

    @PostMapping("/countries")
    fun createCountry(@RequestBody country: Country) = countryService.createCountry(country)

    @GetMapping("/countries")
    fun readCountry() = countryService.readCountry()

    @PutMapping("/countries")
    fun updateCountry(@RequestParam(value = "uuid") uuid:String,@RequestBody country: Country) = countryService.updateCountry(uuid,country)

    @DeleteMapping("/countries")
    fun deleteCountry(@RequestParam(value="uuid") uuid:String)= countryService.deleteCountry(uuid)
}