package com.booking.validation;

import com.booking.utill.dto.UserDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        final UserDto userDto = (UserDto) o;

        return userDto.getPassword().equals(userDto.getMatchingPassword());
    }

}
