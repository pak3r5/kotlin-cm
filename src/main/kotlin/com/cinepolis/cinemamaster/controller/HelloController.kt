package com.cinepolis.cinemamaster.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    fun test(@RequestParam(value="name",defaultValue = "hola") name: String) = "Hola, $name"
}