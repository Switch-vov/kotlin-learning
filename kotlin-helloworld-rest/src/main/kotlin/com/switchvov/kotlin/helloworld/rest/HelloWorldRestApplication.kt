package com.switchvov.kotlin.helloworld.rest

import com.switchvov.kotlin.helloworld.rest.entity.People
import com.switchvov.kotlin.helloworld.rest.service.PeopleService
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.*

/**
 *
 *
 * @author switch
 * @since 2020/5/17
 */
@SpringBootApplication
class HelloWorldRestApplication {
    private val log = LoggerFactory.getLogger(HelloWorldRestApplication::class.java)

    @Bean
    fun init(repository: PeopleService) = CommandLineRunner {
        val now = Date();
        repository.save(People(null, "Jason", "Chen", "Male", 28, now, now))
        repository.save(People(null, "Bluce", "Li", "Male", 32, now, now))
        repository.save(People(null, "Corey", "Chen", "Female", 20, now, now))

        for (people in repository.findAll()!!) {
            log.info(people.toString())
        }

        val customer = repository.findOne(1L)
        log.info(customer.toString())
        for (chen in repository.findByLastName("Chen")!!) {
            log.info(chen.toString())
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(HelloWorldRestApplication::class.java, *args)
}