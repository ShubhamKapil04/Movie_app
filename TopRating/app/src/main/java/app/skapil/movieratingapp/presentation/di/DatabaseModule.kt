package app.skapil.movieratingapp.presentation.di

import android.content.Context
import androidx.room.Room
import app.skapil.movieratingapp.data.db.MovieDao
import app.skapil.movieratingapp.data.db.TMDBDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideMovieDatabase(context: Context): TMDBDatabase{
        return Room.databaseBuilder(context,
            TMDBDatabase::class.java,
            "tmdbclient").build()
    }

    @Singleton
    @Provides
    fun provideMovieDAO(tmdbDatabase: TMDBDatabase): MovieDao{
        return tmdbDatabase.movieDao()
    }

}