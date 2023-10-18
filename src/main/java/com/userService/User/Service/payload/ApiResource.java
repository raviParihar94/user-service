package com.userService.User.Service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResource {
    private String message;
    private boolean success;
    private HttpStatus status;
}
