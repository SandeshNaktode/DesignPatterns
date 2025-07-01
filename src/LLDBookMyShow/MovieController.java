package LLDBookMyShow;

import LLDBookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovies;
    List<Movie> movieList;

    MovieController(){
        cityVsMovies = new HashMap<>();
        movieList = new ArrayList<>();
    }

    //ADD movie to a particular city, make use of cityVsMovies map
    void addMovie(Movie movie, City city) {

        movieList.add(movie);
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }


    Movie getMovieByName(String movieName) {

        for(Movie movie : movieList) {
            if((movie.getMovieName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }


    List<Movie> getMoviesByCity(City city) {
        return cityVsMovies.get(city);
    }
    //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list



}
