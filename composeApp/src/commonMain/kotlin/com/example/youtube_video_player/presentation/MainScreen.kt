package com.example.youtube_video_player.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text("YouTube Player", style = MaterialTheme.typography.h4)
        Spacer(Modifier.height(16.dp))
        Box(modifier = Modifier.fillMaxWidth().aspectRatio(16f / 9f)) {
            CrossPlatformYouTubePlayer(videoId = "MlQaPCZh_Mg") // Change videoId as needed
        }
    }
}