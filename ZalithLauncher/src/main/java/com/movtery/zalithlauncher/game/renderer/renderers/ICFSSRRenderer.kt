package com.movtery.zalithlauncher.game.renderer.renderers

import com.movtery.zalithlauncher.game.renderer.RendererInterface

class ICFSSRRenderer : RendererInterface {

    override fun getRendererId(): String = "ic_fsr"

    override fun getUniqueIdentifier(): String = "ic_fsr_1_0"

    override fun getRendererName(): String = "IC FSR 1.0"

    override fun getRendererSummary(): String? =
        "Renderer with FSR 1.0 + Frame Generation"

    override fun getRendererEnv(): Lazy<Map<String, String>> = lazy {
        mapOf(
            "ENABLE_FSR" to "1",
            "ENABLE_FRAME_GEN" to "1"
        )
    }

    override fun getDlopenLibrary(): Lazy<List<String>> = lazy {
        emptyList()
    }

    override fun getRendererLibrary(): String =
        "libgl4es_114.so"

    override fun getRendererEGL(): String? = null
}
