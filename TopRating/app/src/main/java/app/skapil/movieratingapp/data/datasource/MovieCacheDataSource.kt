package app.skapil.movieratingapp.data.datasource

import app.skapil.movieratingapp.data.model.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>

    suspend fun saveMoviesToCache(movie: List<Movie>)

}