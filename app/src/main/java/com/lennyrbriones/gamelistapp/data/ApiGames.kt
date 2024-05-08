package com.lennyrbriones.gamelistapp.data

import com.lennyrbriones.gamelistapp.model.GamesModel
import com.lennyrbriones.gamelistapp.util.Constants.Companion.API_KEY
import com.lennyrbriones.gamelistapp.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface ApiGames {

    @GET(ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>
}