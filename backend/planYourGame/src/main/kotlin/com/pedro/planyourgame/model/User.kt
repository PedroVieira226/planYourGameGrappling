package com.pedro.planyourgame.model

import jakarta.persistence.*
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

@Entity
    @Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,//imutavel

    @Column(nullable = false)
    val name: String = "",

    @Column(nullable = false, unique = true)
    val email: String = "",//temporariamente imutavel

    @Column(name = "password", nullable = false)
    var encodedPassword: String = "",

    @Column(name = "mat_role", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    var matRole: MatRole = MatRole.STUDENT,

    @Column(name = "system_role", nullable = false)
    @Enumerated(EnumType.STRING)
    var systemRole: SystemRole = SystemRole.USER,

    var profileImage: String = "",

    ) : UserDetails {
    override fun getAuthorities(): Collection<GrantedAuthority> {
        return listOf(SimpleGrantedAuthority("ROLE_${systemRole.name}"))
    }

    override fun getPassword(): String = encodedPassword
    override fun getUsername(): String = email
    override fun isAccountNonExpired(): Boolean = true
    override fun isAccountNonLocked(): Boolean = true
    override fun isCredentialsNonExpired(): Boolean = true
    override fun isEnabled(): Boolean = true
    }




