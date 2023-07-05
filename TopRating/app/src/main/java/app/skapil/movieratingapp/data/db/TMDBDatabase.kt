package app.skapil.movieratingapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import app.skapil.movieratingapp.data.model.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao() : MovieDao
}