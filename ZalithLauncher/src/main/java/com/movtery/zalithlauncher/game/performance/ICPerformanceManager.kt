package com.movtery.zalithlauncher.game.performance
import com.movtery.zalithlauncher.setting.AllSettings
data class ICPerformancePreset(
    val renderScale: Float,
    val fpsLimit: Int,
    val fsrSharpness: Float
)

object ICPerformanceManager {

    fun getCurrentPreset(): ICPerformancePreset {

    val renderScaleValue =
        AllSettings.icRenderScale.getValueOrDefault()

    val sharpnessValue =
        AllSettings.fsrSharpness.getValueOrDefault()

    val safeRenderScale =
        renderScaleValue.coerceAtLeast(30) / 100f

    val safeSharpness =
        sharpnessValue.coerceIn(0, 100) / 100f

    return ICPerformancePreset(
        renderScale = safeRenderScale,
        fpsLimit = 60,
        fsrSharpness = safeSharpness
    )
    }
