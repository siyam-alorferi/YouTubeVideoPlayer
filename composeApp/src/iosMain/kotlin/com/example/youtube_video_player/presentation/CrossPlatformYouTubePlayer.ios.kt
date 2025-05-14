package com.example.youtube_video_player.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.UIKitView
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.readValue
import platform.CoreGraphics.CGRectZero
import platform.WebKit.WKWebView
import platform.WebKit.WKWebViewConfiguration
import platform.CoreGraphics.CGRectMake
import platform.UIKit.*
import platform.WebKit.*

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun CrossPlatformYouTubePlayer(videoId: String) {
    UIKitView(factory = {
        val containerView = UIView(frame = CGRectMake(0.0, 0.0, 0.0, 0.0))

        // 1. UITextField
        val textField = UITextField(frame = CGRectMake(10.0, 10.0, 300.0, 40.0)).apply {
            placeholder = "Enter text here"
        }

        // 2. WKWebView
        val config = WKWebViewConfiguration()
        val webView = WKWebView(frame = CGRectMake(0.0, 60.0, 0.0, 0.0), configuration = config)

        val html = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0">
                <style>
                    body, html {
                        margin: 0;
                        padding: 0;
                        background-color: transparent;
                    }
                    iframe {
                        width: 100%;
                        height: 100%;
                        border: none;
                    }
                </style>
            </head>
            <body>
                <iframe src="https://www.youtube.com/embed/$videoId?playsinline=1" allowfullscreen></iframe>
            </body>
            </html>
        """.trimIndent()

        webView.loadHTMLString(html, baseURL = null)

        // 3. Add subviews to container
        containerView.addSubview(textField)
        containerView.addSubview(webView)

        containerView
    })
}
