package com.pedro.planyourgame.service

import com.pedro.planyourgame.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,

): UserDetailsService {
    override fun loadUserByUsername(login: String): UserDetails? {
        return userRepository.findByLogin(login).orElseThrow{() -> }
    }
}

