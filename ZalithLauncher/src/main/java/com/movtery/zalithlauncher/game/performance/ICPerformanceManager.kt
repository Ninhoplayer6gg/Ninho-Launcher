package com.movtery.zalithlauncher.game.performance

data class ICPerformancePreset(
    val renderScale: Float,
    val fpsLimit: Int,
    val fsrSharpness: Float
)

object ICPerformanceManager {

    fun getCurrentPreset(): ICPerformancePreset {
        return ICPerformancePreset(
            renderScale = 0.8f,
            fpsLimit = 60,
            fsrSharpness = 0.7f
        )
    }
}
