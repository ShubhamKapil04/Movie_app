package app.skapil.movieratingapp.presentation.di

import androidx.room.PrimaryKey
import app.skapil.movieratingapp.data.MovieRepositoryImp
import app.skapil.movieratingapp.data.datasource.MovieCacheDataSource
import app.skapil.movieratingapp.data.datasource.MovieLocalDataSource
import app.skapil.movieratingapp.data.datasource.MovieRemoteDataSource
import app.skapil.movieratingapp.datasourceimp.MovieRemoteDataSourceImp
import app.skapil.movieratingapp.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository{
        return MovieRepositoryImp(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }
}