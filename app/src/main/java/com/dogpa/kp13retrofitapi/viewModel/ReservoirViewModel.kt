package com.dogpa.kp13retrofitapi.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogpa.kp13retrofitapi.apiService.ApiService
import com.dogpa.kp13retrofitapi.model.ReservoirInfo
import kotlinx.coroutines.launch

class ReservoirViewModel  : ViewModel() {

    // 儲存一個水庫的列表
    var reservoirInfoListResponse:List<ReservoirInfo> by mutableStateOf(listOf())

    //儲存API呼叫錯誤資料
    var errorMessage: String by mutableStateOf("")
    fun getReservoirInfoList() {
        viewModelScope.launch {
            //透過try catch進行API呼叫
            val apiService = ApiService.getInstance()
            try {
                val movieList = apiService.getReservoirInfoList()
                reservoirInfoListResponse = movieList
            }
            catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}