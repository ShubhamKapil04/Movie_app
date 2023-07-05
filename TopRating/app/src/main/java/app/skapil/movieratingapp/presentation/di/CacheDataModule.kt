package app.skapil.movieratingapp.presentation.di

import app.skapil.movieratingapp.data.datasource.MovieCacheDataSource
import app.skapil.movieratingapp.datasourceimp.MovieCacheDataSourceImp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideCacheDataSource(): MovieCacheDataSource{
        return MovieCacheDataSourceImp()
    }
}