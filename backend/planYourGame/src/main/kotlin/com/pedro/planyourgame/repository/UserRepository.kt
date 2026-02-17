package com.pedro.planyourgame.repository

import com.pedro.planyourgame.model.Role
import com.pedro.planyourgame.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): Optional<User>

    fun findByUsername(username: String): Optional<User>

    fun findByName(name: String): List<User>

    fun findByRole(role: Role): List<User>

    fun existsByEmail(email: String): Boolean

    fun existsByUsername(username: String): Boolean

    fun existsByName(name: String): Boolean

    fun existsByRole(role: Role): Boolean

}