package app.skapil.movieratingapp.presentation.di

import app.skapil.movieratingapp.data.api.TMDBService
import app.skapil.movieratingapp.data.datasource.MovieLocalDataSource
import app.skapil.movieratingapp.data.db.MovieDao
import app.skapil.movieratingapp.datasourceimp.MovieLocalDataSourceImp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource{
        return MovieLocalDataSourceImp(movieDao)
    }
}