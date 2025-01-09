package com.taehui.vibescribe.controller;

import com.taehui.vibescribe.common.response.ApiResponse;
import com.taehui.vibescribe.entity.User;
import com.taehui.vibescribe.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<ApiResponse<String>> createUser(@RequestBody User user){
        try{
            User newUser = userService.createUser(user);
            return ResponseEntity.ok(ApiResponse.success(newUser.getUsername()));
        } catch(RuntimeException e){
            return ResponseEntity.ok(ApiResponse.error("계정 생성 실패", 400));
        }
    }
}
