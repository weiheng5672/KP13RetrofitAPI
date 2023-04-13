package com.dogpa.kp13retrofitapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.dogpa.kp13retrofitapi.ui.theme.KP13RetrofitAPITheme
import com.dogpa.kp13retrofitapi.viewModel.ReservoirViewModel

class MainActivity : ComponentActivity() {

    val reservoirViewModel by viewModels<ReservoirViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KP13RetrofitAPITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainView(reservoirViewModel.reservoirInfoListResponse)

                    reservoirViewModel.getReservoirInfoList()
                }
            }
        }
    }
}

