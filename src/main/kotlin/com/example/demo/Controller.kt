package com.example.demo


import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@JvmRecord
data class Greeting(val id: Long, val content: String)

@RestController
class GreetingController(private val entityRepository: EntityRepository) {

    @GetMapping("/test")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String?): Greeting {
        entityRepository.save(
            Entity("Bauer")
        )

        return Greeting(3, "aa".toString())
    }

    companion object {
        private const val template = "Hello, %s!"
    }
}
