package com.pedro.planyourgame.repository

import com.pedro.planyourgame.model.SystemRole
import com.pedro.planyourgame.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Repository
@Transactional(readOnly = true)
interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): Optional<User>

    fun findByLogin(login: String): Optional<User>

    fun findByName(name: String): List<User>

    fun findBySystemRole(systemRole: SystemRole): List<User>

    fun existsByEmail(email: String): Boolean

    fun existsByLogin(login: String): Boolean

    fun existsByName(name: String): Boolean

    fun existsBySystemRole(systemRole: SystemRole): Boolean

}