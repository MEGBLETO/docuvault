package com.nelzer.docuvault.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Your Email is required")
    @Email(message = "Your Email format is Invalid")
    private String email;

    @NotBlank(message = "Your Password is required")
    private String password;
}
