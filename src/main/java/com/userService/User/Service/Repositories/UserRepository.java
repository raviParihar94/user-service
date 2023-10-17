package com.userService.User.Service.Repositories;

import com.userService.User.Service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    //
}
