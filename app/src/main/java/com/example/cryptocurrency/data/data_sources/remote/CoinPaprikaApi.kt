package com.example.cryptocurrency.data.data_sources.remote
import com.example.cryptocurrency.data.models.dto.CoinDetailDto
import com.example.cryptocurrency.data.models.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}