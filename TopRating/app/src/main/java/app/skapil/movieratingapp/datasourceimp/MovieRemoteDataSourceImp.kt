package app.skapil.movieratingapp.datasourceimp

import app.skapil.movieratingapp.data.api.TMDBService
import app.skapil.movieratingapp.data.datasource.MovieRemoteDataSource
import app.skapil.movieratingapp.data.db.TMDBDatabase
import app.skapil.movieratingapp.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImp(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource{
    override suspend fun getMovies(): Response<MovieList> =
        tmdbService.getPopularMovies(apiKey)
}