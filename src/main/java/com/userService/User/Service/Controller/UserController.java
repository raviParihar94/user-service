package com.userService.User.Service.Controller;

import com.userService.User.Service.Entity.User;
import com.userService.User.Service.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    // create User
    @PostMapping("/saveUser")
    public ResponseEntity<User> createUser(@RequestBody  User user){
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

    // get User by ID
    @GetMapping("/{userID}")
    public  ResponseEntity<User> getSingleUserByID( @PathVariable  Integer userId){
        User userByID = userService.getUserByID(userId);
        return ResponseEntity.ok(userByID);
    }

    // all users
    public  ResponseEntity<List<User>> getAllUsers(){
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

    // update user


    // delete user
}
