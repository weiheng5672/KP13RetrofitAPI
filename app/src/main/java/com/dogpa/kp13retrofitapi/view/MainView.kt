package com.dogpa.kp13retrofitapi

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dogpa.kp13retrofitapi.model.ReservoirInfo
import com.dogpa.kp13retrofitapi.ui.theme.KP13RetrofitAPITheme
import com.dogpa.kp13retrofitapi.view.ReservoirView

@Composable
fun MainView(reservoirInfoList: List<ReservoirInfo>) {
    LazyColumn {
        itemsIndexed(items = reservoirInfoList) { index, item ->
            ReservoirView(reservoirInfo = item)
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    KP13RetrofitAPITheme {
//        MainView("Android")
//    }
//}