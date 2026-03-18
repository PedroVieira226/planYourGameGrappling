package com.pedro.planyourgame.dto
import com.pedro.planyourgame.model.MatRole
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import jakarta.validation.constraints.NotNull

data class UserSignInDTO(

    @field:Email(message = "Email must be valid")
    @field:NotBlank(message = "Email cannot be blank")
    val email: String,

    @field:NotBlank(message = "Password cannot be blank")
    val password: String,
)
