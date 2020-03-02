package com.cinepolis.cinemamaster.services

import com.cinepolis.cinemamaster.model.Type
import com.cinepolis.cinemamaster.repository.TypeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class TypeService {
    @Autowired
    lateinit var typeRepository: TypeRepository

    fun createType(type: Type) = typeRepository.insert(type)

    fun readType() = typeRepository.findAll()

    fun updateType(id: String, type: Type): Type {
        return if(typeRepository.findById(id)!=null) {
            typeRepository.save(type)
        }
        else{ throw object: Exception("Type not found"){} }
    }

    fun deleteType(id: String) {
        return if(typeRepository.findById(id)!=null) {
            typeRepository.deleteById(id)
        }
        else{ throw object: Exception("Type not found"){} }
    }

    fun findById(id:String): Optional<Type> {
        var type = typeRepository.findById(id);
        if(type!=null) {
            return type
        }
        else{ throw object: Exception("Type not found"){} }
    }

}