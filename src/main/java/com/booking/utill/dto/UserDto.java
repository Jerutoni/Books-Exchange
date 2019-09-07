package com.booking.utill.dto;

import com.booking.validation.PasswordMatches;
import com.booking.validation.ValidEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@PasswordMatches
public class UserDto {

    @NotNull
    @Size(min = 1, max = 15, message = "{Size.userDto.firstName}")
    @NotBlank
    private String firstName;

    @NotNull
    @Size(min = 2, max = 15, message = "{Size.userDto.lastName}")
    @NotBlank
    private String lastName;


    //@ValidPassword
    @NotNull
    @NotBlank
    @Size(min = 6)
    private String password;

    @NotNull
    @Size(min = 6)
    @NotBlank
    private String matchingPassword;

    @ValidEmail
    @NotNull
    @Size(min = 7, message = "{Size.userDto.email}")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}