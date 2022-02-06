package com.skillw.pouvoir.api.script.annotation

import com.skillw.pouvoir.api.script.CompiledFile

class ScriptAnnotationData(
    val annotation: String,
    val compiledFile: CompiledFile,
    val function: String,
    val args: String
)