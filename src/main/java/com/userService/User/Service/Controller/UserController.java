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

    UserService userService;
    /*Constructor Injection */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /*  // create User*/
    @PostMapping("/saveUser")
    public ResponseEntity<User> createUser( @RequestBody  User user){
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    /*get User by ID*/
    @GetMapping("/{userID}")
    public  ResponseEntity<User> getSingleUserByID( @PathVariable  String userID){
        User userByID = userService.getUserByID(userID);
        return ResponseEntity.ok(userByID);
    }

    // all users
    @GetMapping("/allUsers")
    public  ResponseEntity<List<User>> getAllUsers(){
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

    /*todo update user*/


    /* todo  delete user*/
    @DeleteMapping("/delete/{userID}")
    public ResponseEntity<String> deleteUserByID(@RequestParam ("userID") String userID ){
        userService.deleteUserByID(userID);
        return  ResponseEntity.ok("User Deleted SuccessFully !!!");
    }
}
