package com.lennyrbriones.gamelistapp.data

import com.lennyrbriones.gamelistapp.model.GamesModel
import com.lennyrbriones.gamelistapp.model.SingleGameModel
import com.lennyrbriones.gamelistapp.util.Constants.Companion.API_KEY
import com.lennyrbriones.gamelistapp.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiGames {

    @GET(ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>

    @GET("$ENDPOINT/{id}$API_KEY")
    suspend fun getGameById(@Path(value = "id")id :Int): Response<SingleGameModel>
}