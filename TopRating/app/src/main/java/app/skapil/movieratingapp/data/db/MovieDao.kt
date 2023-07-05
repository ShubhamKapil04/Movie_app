package app.skapil.movieratingapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import app.skapil.movieratingapp.data.model.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>)

    @Query("DELETE FROM popular_movie")
    suspend fun deleteAllMovie()

    @Query("SELECT * FROM popular_movie")
    suspend fun getMovies(): List<Movie>

}