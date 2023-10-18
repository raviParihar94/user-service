package com.userService.User.Service.ServicesImpl;

import com.userService.User.Service.Entity.User;
import com.userService.User.Service.Exceptions.ResourceNotFoundException;
import com.userService.User.Service.Repositories.UserRepository;
import com.userService.User.Service.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
       Integer userID = Integer.parseInt( UUID.randomUUID().toString());
       user.setUserID(userID);
       return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByID(Integer userID) {
        User user = userRepository.findById(userID).orElseThrow( ()->new ResourceNotFoundException("User With UserID " + userID +" is Not Found !!"));

        return user;

    }

    @Override
    public void deleteUserByID(Integer userID) {

    }

    @Override
    public User updateUserByID(Integer userID) {
        return null;
    }
}
