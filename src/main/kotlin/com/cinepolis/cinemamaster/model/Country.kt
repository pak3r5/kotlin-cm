package com.cinepolis.cinemamaster.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Country(val id:Long,val uuid:String, val name:String)