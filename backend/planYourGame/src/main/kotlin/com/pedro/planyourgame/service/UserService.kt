package com.pedro.planyourgame.service

import com.pedro.planyourgame.dto.UserSignUpDto
import com.pedro.planyourgame.model.User
import com.pedro.planyourgame.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: BCryptPasswordEncoder

){
    fun signUp(signUpDto: UserSignUpDto): User{

        if(userRepository.existsByEmail(signUpDto.email)){
            throw RuntimeException("User email already exists")
        }

        val hash = passwordEncoder.encode(signUpDto.encodedPassword)

        val user = User(
            name = signUpDto.name,
            email = signUpDto.email,
            encodedPassword = signUpDto.encodedPassword,
            matRole = signUpDto.matRole
        )
        return userRepository.save(user)
    }

}

