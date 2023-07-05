package app.skapil.movieratingapp.presentation

import androidx.lifecycle.liveData
import app.skapil.movieratingapp.domain.usecases.GetMoviesUseCases
import app.skapil.movieratingapp.domain.usecases.UpdateMoviesUseCases
import androidx.lifecycle.ViewModel

class MyViewModel(
    private val getMovesUseCase: GetMoviesUseCases,
    private val updateMoviesUseCases: UpdateMoviesUseCases
    ) : ViewModel(){

        fun getMovies() = liveData {
            val movieList = getMovesUseCase.execute()
            emit(movieList)
        }

        fun updateMovies() = liveData {
            val movieList = updateMoviesUseCases.execute()
            emit(movieList)
        }

}