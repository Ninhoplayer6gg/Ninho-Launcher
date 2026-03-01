package com.movtery.zalithlauncher.game.performance

import android.os.Build

object ICDeviceProfile {

    fun isHelioG37(): Boolean {
        val hardware = Build.HARDWARE.lowercase()
        val board = Build.BOARD.lowercase()
        val model = Build.MODEL.lowercase()

        return hardware.contains("mt6765") ||
               board.contains("mt6765") ||
               model.contains("moto g22")
    }

    fun isLowEndGPU(): Boolean {
        val renderer = android.opengl.GLES20.glGetString(android.opengl.GLES20.GL_RENDERER)?.lowercase()
        return renderer?.contains("powervr") == true
    }
}
