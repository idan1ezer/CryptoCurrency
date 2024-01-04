package com.example.cryptocurrency.domain.repository

import com.example.cryptocurrency.data.models.dto.CoinDetailDto
import com.example.cryptocurrency.data.models.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}