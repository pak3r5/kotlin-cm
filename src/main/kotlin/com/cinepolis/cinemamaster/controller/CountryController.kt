package com.cinepolis.cinemamaster.controller

import com.cinepolis.cinemamaster.model.Country
import com.cinepolis.cinemamaster.services.CountryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/countries")
class CountryController {
    @Autowired
    lateinit var countryService: CountryService

    @PostMapping
    fun createCountry(@RequestBody country: Country) = countryService.createCountry(country)

    @GetMapping("{id}")
    fun findById(@PathVariable ("id")id: String) = countryService.findById(id)

    @GetMapping
    fun readCountry() = countryService.readCountry()

    @PutMapping
    fun updateCountry(@RequestParam( "uuid") uuid:String,@RequestBody country: Country) = countryService.updateCountry(uuid,country)

    @DeleteMapping
    fun deleteCountry(@RequestParam("uuid") uuid:String)= countryService.deleteCountry(uuid)
}