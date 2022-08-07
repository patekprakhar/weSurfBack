package com.example.finalWesurf.userData;

import com.example.finalWesurf.movieData.customized;
import com.example.finalWesurf.userData.users;
import com.example.finalWesurf.userData.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class userController {
    @Autowired
    private userService userService;

    @GetMapping("/users")
    public ResponseEntity getUsers()
    {



        var customizedResponse = new customized("All Users" , userService.getUsers());

        return new ResponseEntity(customizedResponse, HttpStatus.OK);
    }







    @PostMapping(value = "/users", consumes = {
            MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity addUser(@RequestBody users users)
    {

        userService.insertIntoUsers(users);

        return new ResponseEntity(users, HttpStatus.OK);

    }
}

