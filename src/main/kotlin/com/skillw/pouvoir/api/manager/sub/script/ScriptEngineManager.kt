package com.skillw.pouvoir.api.manager.sub.script

import com.skillw.pouvoir.Pouvoir
import com.skillw.pouvoir.api.manager.Manager
import com.skillw.pouvoir.api.map.KeyMap
import com.skillw.pouvoir.api.script.engine.PouScriptEngine
import java.io.File

abstract class ScriptEngineManager : KeyMap<String, PouScriptEngine>(), Manager {

    abstract val globalVariables: MutableMap<String, Any>

    abstract fun getEngine(suffix: String): PouScriptEngine?

    companion object {

        @JvmStatic
        fun File.searchEngine(): PouScriptEngine? {
            return Pouvoir.scriptEngineManager.getEngine(this.extension)
        }
    }
}

