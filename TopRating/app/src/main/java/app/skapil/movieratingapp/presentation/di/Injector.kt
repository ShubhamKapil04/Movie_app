package app.skapil.movieratingapp.presentation.di

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
}