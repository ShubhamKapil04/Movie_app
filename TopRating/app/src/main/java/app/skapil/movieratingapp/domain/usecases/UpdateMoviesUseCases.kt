package app.skapil.movieratingapp.domain.usecases

import app.skapil.movieratingapp.data.model.Movie
import app.skapil.movieratingapp.domain.repository.MovieRepository

class UpdateMoviesUseCases (private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()

}