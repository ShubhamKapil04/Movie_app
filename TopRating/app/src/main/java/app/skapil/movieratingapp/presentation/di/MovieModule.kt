package app.skapil.movieratingapp.presentation.di


import app.skapil.movieratingapp.domain.usecases.GetMoviesUseCases
import app.skapil.movieratingapp.domain.usecases.UpdateMoviesUseCases
import app.skapil.movieratingapp.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCases: GetMoviesUseCases,
        updateMoviesUseCases: UpdateMoviesUseCases
        ): ViewModelFactory{
        return ViewModelFactory(
            getMoviesUseCases,
            updateMoviesUseCases
        )
    }

}