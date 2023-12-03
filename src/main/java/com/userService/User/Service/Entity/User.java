package com.userService.User.Service.Entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "microservice_users")
@Data
public class User {
    @Id
    @Column (name = "USER_ID")
    private String userID;

    @Column(name ="USER_NAME")
    private String userName;

    @Column (name = "EMAIL")
    private String email;

    @Column(name ="ABOUT")
    private String about;

    @Column (name ="ADDRESS")
    private String address;

    @Column (name = "PHONE_NUMBER")
    private String phoneNumber;




}
