package app.skapil.movieratingapp.data.datasource

import app.skapil.movieratingapp.data.model.Movie
import app.skapil.movieratingapp.data.model.MovieList
import retrofit2.Response

interface MovieLocalDataSource {

    suspend fun getMovieFromDB() : List<Movie>

    suspend fun saveMoviesToDB(movies: List<Movie>)

    suspend fun clearAll()

}