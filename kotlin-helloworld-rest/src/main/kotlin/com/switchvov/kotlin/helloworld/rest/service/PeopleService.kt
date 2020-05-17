package com.switchvov.kotlin.helloworld.rest.service

import com.switchvov.kotlin.helloworld.rest.entity.People
import com.switchvov.kotlin.helloworld.rest.repository.PeopleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *
 *
 * @author switch
 * @since 2020/5/17
 */
@Service
class PeopleService {
    @Autowired
    val peopleRepository: PeopleRepository? = null

    fun findByLastName(lastName: String): List<People>? {
        return peopleRepository?.findByLastName(lastName)
    }

    fun save(entity: People): People? {
        return peopleRepository?.save(entity)
    }

    fun findAll(): MutableIterable<People>? {
        return peopleRepository?.findAll()
    }

    fun findOne(id: Long): People? {
        val people = peopleRepository?.findById(id)
        return people?.orElse(null)
    }
}