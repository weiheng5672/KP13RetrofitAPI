package com.dogpa.kp13retrofitapi.apiService

import com.dogpa.kp13retrofitapi.model.ReservoirInfo
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    //取得水庫的列表
    @GET("WraApi/v1/Reservoir/RealTimeInfo")
    suspend fun getReservoirInfoList() : List<ReservoirInfo>

    //建立實例
    companion object {
        var apiService: ApiService? = null
        fun getInstance() : ApiService {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl("https://fhy.wra.gov.tw/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}