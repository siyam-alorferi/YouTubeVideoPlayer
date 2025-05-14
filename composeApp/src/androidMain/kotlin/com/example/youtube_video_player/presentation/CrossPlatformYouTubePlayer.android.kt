package com.example.youtube_video_player.presentation

import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.FrameLayout
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
actual fun CrossPlatformYouTubePlayer(videoId: String) {

    AndroidView(
        factory = { context ->
            WebView(context).apply {
                layoutParams = FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                settings.javaScriptEnabled = true
                settings.loadWithOverviewMode = true
                settings.useWideViewPort = true
                settings.pluginState = WebSettings.PluginState.ON
                loadData(
                    """
                    <html>
                    <body style="margin:0;">
                        <iframe width="100%" height="100%"
                            src="https://www.youtube.com/embed/$videoId?playsinline=1"
                            frameborder="0" allowfullscreen>
                        </iframe>
                    </body>
                    </html>
                    """.trimIndent(),
                    "text/html",
                    "utf-8"
                )
            }
        },
        modifier = Modifier
    )
}