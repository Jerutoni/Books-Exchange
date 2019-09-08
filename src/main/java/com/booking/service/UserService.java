package com.booking.service;

import com.booking.persistence.dao.UserRepository;
import com.booking.persistence.model.User;
import com.booking.utill.dto.UserDto;
import com.booking.web.error.UserAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    UserRepository repository;

    @Override
    public User registerNewUserAccount(final UserDto userDto) throws UserAlreadyExistException{
        if (emailExists(userDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email adress: " + userDto.getEmail());
        }
        final User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        repository.save(user);
        return  user;
    }

    private boolean emailExists(final String email) {
        return repository.findByEmail(email) != null;
    }
}
