package com.cinepolis.cinemamaster.controller

import com.cinepolis.cinemamaster.model.Cinema
import com.cinepolis.cinemamaster.services.CinemaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/cinemas")
class CinemaController {
    @Autowired
    lateinit var typeService: CinemaService

    @PostMapping
    fun createCinema(@RequestBody cinema: Cinema) = typeService.createCinema(cinema)

    @GetMapping("{id}")
    fun findById(@PathVariable ("id")id: String) = typeService.findById(id)

    @GetMapping
    fun readCinema() = typeService.readCinema()

    @PutMapping
    fun updateCinema(@RequestParam( "uuid") uuid:String,@RequestBody cinema: Cinema) = typeService.updateCinema(uuid,cinema)

    @DeleteMapping
    fun deleteCinema(@RequestParam("uuid") uuid:String)= typeService.deleteCinema(uuid)
}