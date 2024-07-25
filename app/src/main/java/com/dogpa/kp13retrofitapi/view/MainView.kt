package com.dogpa.kp13retrofitapi.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dogpa.kp13retrofitapi.R
import com.dogpa.kp13retrofitapi.model.ReservoirInfo
import com.dogpa.kp13retrofitapi.viewModel.ReservoirViewModel
import com.dogpa.kp13retrofitapi.viewModel.UiState

@Composable
fun MainView() {

    val reservoirViewModel: ReservoirViewModel = viewModel()

    HomeScreen(
        reservoirUiState = reservoirViewModel.reservoirUiState
    )

}

@Composable
fun HomeScreen(
    reservoirUiState: UiState,
    modifier: Modifier = Modifier
) {

    when (reservoirUiState ) {

        is UiState.Loading -> LoadingScreen(modifier = modifier.fillMaxSize())

        is UiState.Success -> ResultScreen(
            data = reservoirUiState.data
        )

        is UiState.Error -> ErrorScreen( modifier = modifier.fillMaxSize())

    }

}

@Composable
fun ResultScreen(
    data: List<ReservoirInfo>
) {
    LazyColumn {
        itemsIndexed(items = data) { index, item ->
            ReservoirView(reservoirInfo = item)
        }
    }

}

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(200.dp),
        painter = painterResource(R.drawable.loading_img),
        contentDescription = stringResource(R.string.loading)
    )
}

@Composable
fun ErrorScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_connection_error), contentDescription = ""
        )
        androidx.compose.material3.Text(text = stringResource(R.string.loading_failed), modifier = Modifier.padding(16.dp))
    }
}


