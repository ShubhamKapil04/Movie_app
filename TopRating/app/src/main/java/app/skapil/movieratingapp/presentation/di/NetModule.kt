package app.skapil.movieratingapp.presentation.di

import app.skapil.movieratingapp.data.api.TMDBService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule (private val baseUrl: String) {

    // This will return the retrofit singleton
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun providesTMDBServices(retrofit: Retrofit): TMDBService{
        return retrofit.create(TMDBService::class.java)
    }

}