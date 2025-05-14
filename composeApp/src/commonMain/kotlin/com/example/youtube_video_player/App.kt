package com.example.youtube_video_player

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import chaintech.videoplayer.host.MediaPlayerHost
import chaintech.videoplayer.model.VideoPlayerConfig
import chaintech.videoplayer.ui.youtube.YouTubePlayerComposable
import chaintech.videoplayer.util.ComposeResourceDrawable
import com.example.youtube_video_player.presentation.MainScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import youtubevideoplayer.composeapp.generated.resources.Res
import youtubevideoplayer.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {

    val playerHost = remember { MediaPlayerHost(mediaUrl = "QFxN2oDKk0E") }

    YouTubePlayerComposable(
        modifier = Modifier.fillMaxSize(),
        playerHost = playerHost,
        playerConfig = VideoPlayerConfig(
            isPauseResumeEnabled = true,
            isSeekBarVisible = true,
            isDurationVisible = true,
            seekBarThumbColor = Color.Red,
            seekBarActiveTrackColor = Color.Red,
            seekBarInactiveTrackColor = Color.White,
            durationTextColor = Color.White,
            seekBarBottomPadding = 10.dp,
            pauseResumeIconSize = 40.dp,
            isAutoHideControlEnabled = true,
            controlHideIntervalSeconds = 5,
            isFastForwardBackwardEnabled = true,
        )
    )







    /*MaterialTheme {

        MainScreen()


        *//*var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }*//*
    }*/
}