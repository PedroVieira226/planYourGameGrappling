package com.pedro.planyourgame.model

import jakarta.persistence.*
import java.io.Serializable

@Entity
    @Table(name = "users") // Boa prática para evitar conflito com a palavra reservada 'user' no Postgres
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var name: String = "",

    @Column(nullable = false, unique = true)
    var email: String = "",

    @Column(nullable = false)
    var password: String = "",

    @Column(nullable = false, unique = true)
    var username: String = "",

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var role: Role,

    var profileImage: String?

) : Serializable