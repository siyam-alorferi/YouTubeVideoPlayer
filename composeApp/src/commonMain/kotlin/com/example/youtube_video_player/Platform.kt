package com.example.youtube_video_player

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform