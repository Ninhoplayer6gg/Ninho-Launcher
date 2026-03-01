package com.movtery.zalithlauncher.game.performance
import com.movtery.zalithlauncher.setting.AllSettings
data class ICPerformancePreset(
    val renderScale: Float,
    val fpsLimit: Int,
    val fsrSharpness: Float
)

object ICPerformanceManager {

    fun getCurrentPreset(): ICPerformancePreset {
    return ICPerformancePreset(
        renderScale = AllSettings.icRenderScale.getValue() / 100f,
        fpsLimit = 60,
        fsrSharpness = AllSettings.fsrSharpness.getValue() / 100f
    )
    }
