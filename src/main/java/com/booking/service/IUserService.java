package com.booking.service;

import com.booking.persistence.model.User;
import com.booking.utill.dto.UserDto;
import com.booking.web.error.UserAlreadyExistException;

public interface IUserService {
    User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException;
}
