package com.cinepolis.cinemamaster.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

@Document(collection="cinemas")
data class Cinema(@Id val id:String?=null,
                  @DBRef val country:Country?,
                  @DBRef val type:Type?,
                  @Field val name:String,
                  @Field val ip:String,
                  @Field val isAvailable:Boolean,
                  @Field val isOnline:Boolean,
                  @Field val lastUpdate: Date? = Date()) {
}