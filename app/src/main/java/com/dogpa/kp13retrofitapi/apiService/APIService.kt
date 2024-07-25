package com.dogpa.kp13retrofitapi.apiService

import com.dogpa.kp13retrofitapi.model.ReservoirInfo
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    //取得水庫的列表
    @GET("WraApi/v1/Reservoir/RealTimeInfo")
    suspend fun getReservoirInfoList() : List<ReservoirInfo>
}

private const val BASE_URL =
    "https://fhy.wra.gov.tw/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(
        GsonConverterFactory.create()
    )
    .baseUrl(BASE_URL)
    .build()

object ReservoirApi {

    val retrofitService : ApiService by lazy {

        retrofit.create(ApiService::class.java)

    }

}





