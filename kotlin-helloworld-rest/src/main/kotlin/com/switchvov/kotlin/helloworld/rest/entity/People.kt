package com.switchvov.kotlin.helloworld.rest.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 *
 *
 * @author switch
 * @since 2020/5/17
 */
@Entity
class People(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long?,
    val firstName: String?,
    val lastName: String?,
    val gender: String?,
    val age: Int?,
    val gmtCreated: Date,
    val gmtModified: Date
) {
    override fun toString(): String {
        return "Peopel(id=$id, firstName=$firstName, lastName=$lastName, gender=$gender, age=$age, gmtCreated=$gmtCreated, gmtModified=$gmtModified)"
    }
}