package com.cinepolis.cinemamaster.repository

import com.cinepolis.cinemamaster.model.Country

interface CountryRepository {
    fun createCountry(country: Country)
    fun readCountry(): List<Country>
    fun updateCountry(uuid:String,country: Country)
    fun deleteCountry(uuid:String)
}