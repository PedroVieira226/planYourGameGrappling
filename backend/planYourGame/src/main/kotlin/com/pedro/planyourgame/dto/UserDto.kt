package com.pedro.planyourgame.dto
import com.pedro.planyourgame.model.MatRole
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import jakarta.validation.constraints.NotNull

data class UserDto(

    @field:NotBlank(message = "Name cannot be blank")
    val name: String,

    @field:Email(message = "Email must be valid")
    @field:NotBlank(message = "Email cannot be blank")
    val email: String,

    @field:NotBlank(message = "Password cannot be blank")
    @field:Size(min = 6, message = "Password cannot be smaller than 6 characters")
    val password: String,

    @field:NotNull(message = "Role cannot be blank")
    val role: MatRole
)