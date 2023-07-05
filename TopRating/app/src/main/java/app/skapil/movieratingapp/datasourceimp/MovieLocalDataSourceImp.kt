package app.skapil.movieratingapp.datasourceimp

import app.skapil.movieratingapp.data.datasource.MovieLocalDataSource
import app.skapil.movieratingapp.data.db.MovieDao
import app.skapil.movieratingapp.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MovieLocalDataSourceImp(private val movieDao: MovieDao) : MovieLocalDataSource {
    override suspend fun getMovieFromDB(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovie()
        }
    }
}