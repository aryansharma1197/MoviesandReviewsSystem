package dev.movieproject.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieReporisitory movieReporisitory;
    public List<Movie> allMovies(){
        return movieReporisitory.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieReporisitory.findMoviesByImdbId(imdbId);

    }

}
