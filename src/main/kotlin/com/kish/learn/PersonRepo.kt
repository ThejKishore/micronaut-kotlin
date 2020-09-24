package com.kish.learn

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Introspected
@Entity
data class Person(
        @Id
        @GeneratedValue
        var id:Long?,
        val name:String)



@JdbcRepository(dialect = Dialect.H2)
interface PersonRepo : CrudRepository<Person,Long>{
    override fun findAll(): List<Person>

}

