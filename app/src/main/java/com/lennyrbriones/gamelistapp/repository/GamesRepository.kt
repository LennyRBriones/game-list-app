package com.lennyrbriones.gamelistapp.repository

import com.lennyrbriones.gamelistapp.data.ApiGames
import com.lennyrbriones.gamelistapp.model.GameList
import com.lennyrbriones.gamelistapp.model.SingleGameModel
import javax.inject.Inject

class GamesRepository @Inject constructor(private val apiGames: ApiGames) {

    suspend fun getGames(): List<GameList>? {
        val response = apiGames.getGames()
        if (response.isSuccessful){
            return response.body()?.results
        }
        return null
    }

    suspend fun getGameById(id: Int): SingleGameModel? {
        val response = apiGames.getGameById(id)
        if (response.isSuccessful){
            return response.body()
        }
        return null
    }
}