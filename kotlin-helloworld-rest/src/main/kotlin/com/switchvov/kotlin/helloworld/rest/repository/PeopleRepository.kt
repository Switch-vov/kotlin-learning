package com.switchvov.kotlin.helloworld.rest.repository

import com.switchvov.kotlin.helloworld.rest.entity.People
import org.springframework.data.repository.CrudRepository

/**
 *
 *
 * @author switch
 * @since 2020/5/17
 */
interface PeopleRepository : CrudRepository<People, Long> {
    fun findByLastName(lastName: String): List<People>?
}