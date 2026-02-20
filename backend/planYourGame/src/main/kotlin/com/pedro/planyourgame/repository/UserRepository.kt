package com.pedro.planyourgame.repository

import com.pedro.planyourgame.model.SystemRole
import com.pedro.planyourgame.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): Optional<User>

    fun findByLogin(username: String): Optional<User>

    fun findByName(name: String): List<User>

    fun findBySystemRole(systemRole: SystemRole): List<User>

    fun existsByEmail(email: String): Boolean

    fun existsByLogin(username: String): Boolean

    fun existsByName(name: String): Boolean

    fun existsBySystemRole(systemRole: SystemRole): Boolean

}