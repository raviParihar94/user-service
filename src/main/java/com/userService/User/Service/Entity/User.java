package com.userService.User.Service.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "micro_users")
@Data
public class User {
    @Id
    @Column (name = "USER_ID")
    private Integer userID;
    @Column(name ="USER_NAME")
    private String userName;
    private String email;

    private String about;
}
