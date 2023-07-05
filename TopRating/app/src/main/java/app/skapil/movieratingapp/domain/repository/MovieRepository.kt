package app.skapil.movieratingapp.domain.repository

import app.skapil.movieratingapp.data.model.Movie

interface MovieRepository {

    suspend fun  getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?

}