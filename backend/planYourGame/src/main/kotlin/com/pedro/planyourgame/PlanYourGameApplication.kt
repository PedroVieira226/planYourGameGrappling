package com.pedro.planyourgame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])//tirar esse exclude dps
class PlanYourGameApplication

fun main(args: Array<String>) {
	runApplication<PlanYourGameApplication>(*args)
}
