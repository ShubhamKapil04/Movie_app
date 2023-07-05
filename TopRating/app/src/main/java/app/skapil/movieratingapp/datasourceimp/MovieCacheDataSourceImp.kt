package app.skapil.movieratingapp.datasourceimp

import app.skapil.movieratingapp.data.datasource.MovieCacheDataSource
import app.skapil.movieratingapp.data.model.Movie

class MovieCacheDataSourceImp: MovieCacheDataSource {
    // Creating cache in array list
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movie: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movie)
    }
}