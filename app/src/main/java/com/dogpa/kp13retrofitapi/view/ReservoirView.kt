package com.dogpa.kp13retrofitapi.view


import android.icu.text.DecimalFormat
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.dogpa.kp13retrofitapi.model.ReservoirInfo
import com.dogpa.kp13retrofitapi.model.reservoirDict
import com.dogpa.kp13retrofitapi.ui.theme.KP13RetrofitAPITheme

@Composable
fun ReservoirView(reservoirInfo: ReservoirInfo) {
    val df = DecimalFormat("#.##")
    val percentage = reservoirInfo.PercentageOfStorage ?: -1
    Column {
        Divider(color = Color.Blue)
        Text(text = reservoirDict.getOrDefault(reservoirInfo.StationNo,""))
        Row() {
            Text(text = "蓄水量：")
            Text(text = "${df.format(percentage)} %",
                color = checkPercentWater(percentage.toDouble())
                )
        }
        Text(text = "更新時間:${reservoirInfo.Time}")
    }

}

fun checkPercentWater(percent: Double): Color {
    return when (percent) {
        -1.0 -> return Color.Black
        in 0f..19.9999999999999999f -> return Color.Red
        in 20f..39.9999999999999999f -> return Color.Magenta
        in 0f..59.9999999999999999f -> return Color.Yellow
        in 0f..79.9999999999999999f -> return Color.Green
        in 0f..100f -> return Color.Blue
        else -> return Color.Black
    }
}

@Preview(showBackground = true)
@Composable
fun ReservoirViewPreview() {
    KP13RetrofitAPITheme {
        ReservoirView(ReservoirInfo("",5.31233,""))
    }
}


