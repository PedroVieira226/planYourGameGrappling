package com.pedro.planyourgame.controller

import com.pedro.planyourgame.dto.UserSignUpDto
import com.pedro.planyourgame.model.User
import com.pedro.planyourgame.service.UserService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(
    private val userService: UserService
) {

    @PostMapping("/signup")
    fun signup(@Valid@RequestBody signupDto: UserSignUpDto): ResponseEntity<User> {

        val newUser = userService.signUp(signupDto)
            
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser)

    }

}
