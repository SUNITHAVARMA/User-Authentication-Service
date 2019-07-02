package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exception.UserAlreadyExistsException;

import java.util.List;

public interface UserService {

    User findByEmailIdAndPassword(String emailId,String password);
    public User saveUser(User user) throws UserAlreadyExistsException;
    public List<User> getAllUsers();
}
