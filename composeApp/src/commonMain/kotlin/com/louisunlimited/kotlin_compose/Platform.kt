package com.louisunlimited.kotlin_compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform