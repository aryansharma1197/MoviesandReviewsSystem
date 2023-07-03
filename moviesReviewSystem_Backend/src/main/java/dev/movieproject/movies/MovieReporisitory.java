package dev.movieproject.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieReporisitory extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMoviesByImdbId(String imdbId);
}

