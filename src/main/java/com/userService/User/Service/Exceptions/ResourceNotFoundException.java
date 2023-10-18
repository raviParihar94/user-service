package com.userService.User.Service.Exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("User Not Found Exception !! ");
    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
