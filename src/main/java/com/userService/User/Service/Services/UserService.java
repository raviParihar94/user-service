package com.userService.User.Service.Services;

import com.userService.User.Service.Entity.User;

import java.util.List;

public interface UserService {

    // define user operations

    /// save user
   User saveUser(User user);

   List<User> getAllUser();

   User getUserByID(String userID);

   void deleteUserByID( String userID);

   User updateUserByID(String userID);

}
