package com.cinepolis.cinemamaster.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection="types")
data class Type(@Id val id:String?=null, @Field val name:String)