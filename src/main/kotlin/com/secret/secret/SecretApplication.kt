package com.secret.secret

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecretApplication

fun main(args: Array<String>) {
    runApplication<SecretApplication>(*args)
}
