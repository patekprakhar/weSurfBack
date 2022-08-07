package com.example.finalWesurf.movieData;

import com.example.finalWesurf.movieData.movie;
import com.example.finalWesurf.movieData.movieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movieService {
    @Autowired
    private movieRepo repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<movie> getMovies()

    {
        return repository.findAll();
    }


    public List<movie> getFeatured(String r)

    {

        // business logics
        Query query = new Query();
        query.addCriteria(Criteria.where("isFeatured" ).is(true));
        List<movie> movies = mongoTemplate.find(query, movie.class);
        return movies;


    }

    public void insertIntoMovies(movie movie)
    {

        repository.insert(movie);

    }

    public Optional<movie> getAMovie(String id) throws Exception
    {

        Optional<movie> movie = repository.findById(id);

        if (!movie.isPresent())
        {
            throw new Exception (" Movie with " + id + " is not found ");
        }

        return movie;

    }

    public Optional<movie> featuredMovie(String id) throws Exception
    {
        Optional<movie> featured = repository.findById(id);
        if (featured.isPresent() == true) {
            return featured;
        }

        throw new Exception("No featured movie");
    }

    public void deleteAMovie( String id)
    {
        repository.deleteById(id);
    }

}


