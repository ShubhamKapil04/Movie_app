package app.skapil.movieratingapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import app.skapil.movieratingapp.domain.usecases.GetMoviesUseCases
import app.skapil.movieratingapp.domain.usecases.UpdateMoviesUseCases

class ViewModelFactory (
    private val getMoviesUseCases: GetMoviesUseCases,
    private val updateMoviesUseCases: UpdateMoviesUseCases
    ): ViewModelProvider.Factory
{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MyViewModel(getMoviesUseCases, updateMoviesUseCases) as T
    }
}