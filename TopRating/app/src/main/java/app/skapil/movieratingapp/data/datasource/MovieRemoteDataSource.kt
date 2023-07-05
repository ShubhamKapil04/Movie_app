package app.skapil.movieratingapp.data.datasource

import app.skapil.movieratingapp.data.model.MovieList
import retrofit2.Response


interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>


}