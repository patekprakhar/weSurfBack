package com.example.finalWesurf.userData;

import com.example.finalWesurf.movieData.movie;
import com.example.finalWesurf.userData.users;
import com.example.finalWesurf.userData.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class userService {
    @Autowired
    private userRepo repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<users> getUsers()

    {
        return repository.findAll();
    }

    public void insertUsers(users users)
    {


        repository.insert(users);

    }

    public void insertIntoUsers(users users)
    {

        repository.insert(users);

    }

}
