package com.huillca.amphibians.data

import com.huillca.amphibians.model.Amphibian
import com.huillca.amphibians.network.AmphibiansApiService


interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class DefaultAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}
