package app.skapil.movieratingapp.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import app.skapil.movieratingapp.data.model.MovieList

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ) : Response<MovieList>

}