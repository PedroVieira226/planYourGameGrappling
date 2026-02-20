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

    @Column(nullable = false)
    var encodedPassword: String = "",

    @Column(nullable = false, unique = true)
    val login: String = "",//temporariamente imutavel

    @Enumerated(EnumType.STRING)
    var matRole: MatRole = MatRole.STUDENT,

    @Enumerated(EnumType.STRING)
    var systemRole: SystemRole = SystemRole.USER,

    var profileImage: String = "",

    ) : UserDetails {
    override fun getAuthorities(): Collection<GrantedAuthority> {
        return listOf(SimpleGrantedAuthority("ROLE_${systemRole.name}"))
    }

    override fun getPassword(): String = encodedPassword

    override fun getUsername(): String = login

    override fun isAccountNonExpired(): Boolean = true
    override fun isAccountNonLocked(): Boolean = true
    override fun isCredentialsNonExpired(): Boolean = true
    override fun isEnabled(): Boolean = true
    }




