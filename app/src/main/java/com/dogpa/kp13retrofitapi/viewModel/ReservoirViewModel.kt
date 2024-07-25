package com.dogpa.kp13retrofitapi.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogpa.kp13retrofitapi.apiService.ReservoirApi
import com.dogpa.kp13retrofitapi.model.ReservoirInfo
import kotlinx.coroutines.launch
import java.io.IOException


sealed interface UiState {

    data class Success(
        val data: List<ReservoirInfo>
    ) : UiState

    object Error : UiState
    object Loading : UiState
}


class ReservoirViewModel  : ViewModel() {

    // 儲存一個水庫的列表
    var reservoirUiState: UiState by mutableStateOf(UiState.Loading)

    init {
        getData()
    }

    private fun getData() {

        viewModelScope.launch {

            reservoirUiState = try {

                UiState.Success(
                    data = ReservoirApi.retrofitService.getReservoirInfoList()
                )

            } catch (e: IOException) {
                UiState.Error
            }

        }

    }
}