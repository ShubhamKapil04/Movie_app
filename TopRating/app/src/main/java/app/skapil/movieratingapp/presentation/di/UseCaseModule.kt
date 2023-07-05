package app.skapil.movieratingapp.presentation.di

import app.skapil.movieratingapp.domain.repository.MovieRepository
import app.skapil.movieratingapp.domain.usecases.GetMoviesUseCases
import app.skapil.movieratingapp.domain.usecases.UpdateMoviesUseCases
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {


    @Provides
    fun provideGetMovieUseCasa(movieRepository: MovieRepository): GetMoviesUseCases{
        return GetMoviesUseCases(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCases{
        return UpdateMoviesUseCases(movieRepository)
    }

}