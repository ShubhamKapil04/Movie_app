package app.skapil.movieratingapp

import android.app.Application
import app.skapil.movieratingapp.presentation.di.AppComponent
import app.skapil.movieratingapp.presentation.di.AppModule
import app.skapil.movieratingapp.presentation.di.DaggerAppComponent
import app.skapil.movieratingapp.presentation.di.Injector
import app.skapil.movieratingapp.presentation.di.MovieSubComponent
import app.skapil.movieratingapp.presentation.di.NetModule
import app.skapil.movieratingapp.presentation.di.RemoteDataModule

class App: Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

}