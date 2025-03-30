package com.example.blogApp.payloads;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;

    @NotEmpty
    @Size(min = 4, message = "Username must be min of 4 characters")
    private String name;

    @Email( message = "Email is not valid")
    private String email;

    @NotEmpty
    @Size(min = 3,max = 10,message = "password must be min of 3 characters and max of 10 characters")
    private String password;

    @NotEmpty
    private String about;
}
