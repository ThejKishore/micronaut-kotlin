package com.kish.learn

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
            .args(*args)
            .packages("com.kish.learn")
            .start()
}

