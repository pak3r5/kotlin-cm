package com.cinepolis.cinemamaster.controller

import com.cinepolis.cinemamaster.model.Type
import com.cinepolis.cinemamaster.services.TypeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/types")
class TypeController {
    @Autowired
    lateinit var typeService: TypeService

    @PostMapping
    fun createCountry(@RequestBody type: Type) = typeService.createType(type)

    @GetMapping("{id}")
    fun findById(@PathVariable ("id")id: String) = typeService.findById(id)

    @GetMapping
    fun readCountry() = typeService.readType()

    @PutMapping
    fun updateCountry(@RequestParam( "uuid") uuid:String,@RequestBody type: Type) = typeService.updateType(uuid,type)

    @DeleteMapping
    fun deleteCountry(@RequestParam("uuid") uuid:String)= typeService.deleteType(uuid)
}