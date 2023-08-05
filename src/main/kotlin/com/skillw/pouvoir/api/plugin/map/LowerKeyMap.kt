package com.skillw.pouvoir.api.plugin.map

import com.skillw.pouvoir.api.plugin.map.component.Keyable
import java.util.function.BiFunction
import java.util.function.Function


/**
 * Lower key map
 *
 * @param V
 * @constructor Create empty Lower key map
 */
open class LowerKeyMap<V : Keyable<String>> : KeyMap<String, V>() {


    override operator fun get(key: String): V? {
        return super.get(key.lowercase())
    }

    override fun remove(key: String): V? {
        return super.remove(key.lowercase())
    }

    override fun containsKey(key: String): Boolean {
        return super.containsKey(key.lowercase())
    }

    override operator fun set(key: String, value: V): V? {
        return super.put(key.lowercase(), value)
    }

    override fun put(key: String, value: V): V? {
        return super.put(key.lowercase(), value)
    }

    override fun putAll(from: Map<out String, V>) {
        super.putAll(from.mapKeys { it.key.lowercase() })
    }

    override fun computeIfAbsent(key: String, mappingFunction: Function<in String, out V>): V {
        return super.computeIfAbsent(key.lowercase(), mappingFunction)
    }

    override fun compute(key: String, remappingFunction: BiFunction<in String, in V?, out V?>): V? {
        return super.compute(key.lowercase(), remappingFunction)
    }

    override fun merge(key: String, value: V, remappingFunction: BiFunction<in V, in V, out V?>): V? {
        return super.merge(key.lowercase(), value, remappingFunction)
    }

    override fun putIfAbsent(key: String, value: V): V? {
        return super.putIfAbsent(key.lowercase(), value)
    }
}