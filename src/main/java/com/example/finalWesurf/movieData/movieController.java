package com.example.finalWesurf.movieData;

import com.example.finalWesurf.movieData.customized;
import com.example.finalWesurf.movieData.movie;
import com.example.finalWesurf.movieData.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class movieController {
    @Autowired
    private movieService movieService;

    @GetMapping("/movies")
    public ResponseEntity getMovies()
    {



        var customizedResponse = new customized("All Movies" , movieService.getMovies());

        return new ResponseEntity(customizedResponse, HttpStatus.OK);
    }

    @GetMapping("/movies/featured")
    public ResponseEntity getFeatured(@RequestParam(value = "rate") String r)
    {

        var customizedResponse = new customized(" Featured Movies" , movieService.getFeatured(r));

        return new ResponseEntity(customizedResponse, HttpStatus.OK);
    }


    @GetMapping("/movies/{id}")
    public ResponseEntity getAMovie(@PathVariable("id") String id) {


        customized customizedResponse = null;
        try {
            customizedResponse = new customized(" Movie with id " + id , Collections.singletonList(movieService.getAMovie(id)));
        } catch (Exception e) {

            customizedResponse = new customized(e.getMessage(), null);

            return new ResponseEntity(customizedResponse, HttpStatus.NOT_FOUND);

        }

        return new ResponseEntity(customizedResponse, HttpStatus.OK);

    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity deleteAMovie(@PathVariable("id") String id)
    {

        movieService.deleteAMovie(id);
        return new ResponseEntity(HttpStatus.OK);


    }

    @PostMapping(value = "/movies", consumes = {
            MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity addMovie(@RequestBody movie movie)
    {

        movieService.insertIntoMovies(movie);

        return new ResponseEntity(movie, HttpStatus.OK);

    }

}
