package com.cinepolis.cinemamaster.model

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Cinema(val id:Long,val uuid:String,val country_id:String,val cinema:String, val ip:String,val isAvailable:Boolean,val isOnline:Boolean, val lastUpdate: Date,val type_id:Long) {
}