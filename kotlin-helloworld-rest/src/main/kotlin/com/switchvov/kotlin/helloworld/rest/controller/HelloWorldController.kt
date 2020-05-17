package com.switchvov.kotlin.helloworld.rest.controller

import com.switchvov.kotlin.helloworld.rest.entity.People
import com.switchvov.kotlin.helloworld.rest.service.PeopleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 *
 *
 * @author switch
 * @since 2020/5/17
 */
@RestController
class HelloWorldController {

    @Autowired
    val peopleService: PeopleService? = null

    @GetMapping(*arrayOf("/helloworld", "/"))
    fun helloworld(): Any {
        return "HelloWorld"
    }

    @GetMapping("/hello")
    fun hello(@RequestParam("lastName") lastName: String): Any {
        val peoples = peopleService?.findByLastName(lastName)
        val map = HashMap<String, List<People>>()
        map["hello"] = peoples!!
        return map
    }
}