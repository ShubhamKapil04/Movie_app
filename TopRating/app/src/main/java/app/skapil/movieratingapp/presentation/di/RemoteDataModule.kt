package app.skapil.movieratingapp.presentation.di

import app.skapil.movieratingapp.data.api.TMDBService
import app.skapil.movieratingapp.data.datasource.MovieRemoteDataSource
import app.skapil.movieratingapp.datasourceimp.MovieRemoteDataSourceImp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource{
        return MovieRemoteDataSourceImp(
            tmdbService,
            apiKey
        )
    }
}