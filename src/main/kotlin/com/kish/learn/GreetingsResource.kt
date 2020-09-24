package com.kish.learn

import io.micronaut.http.annotation.*

@Controller
class GreetingsResource (val personRepo:PersonRepo) {

    @Get("/greet")
    fun greetUser(): String = "Hello World"


    @Get("/greet/{name}")
    fun greetUser(@PathVariable("name") name : String):String = "hello $name"

    @Get("/persons")
    fun allPerson():List<Person> = this.personRepo.findAll()

    @Post("/person")
    fun savePerson(@Body person:Person):Person = this.personRepo.save(person)

    @Get("/person/{id}")
    fun findById(@PathVariable("id") id:Long):Person = this.personRepo.findById(id).orElse(null)


}