package app.revanced.patcher

import app.revanced.patcher.util.dex.DexFile

/**
 * The result of a patcher.
 * @param dexFiles The patched dex files.
 * @param doNotCompress List of relative paths to files to exclude from compressing.
 */
data class PatcherResult(
    val dexFiles: List<DexFile>,
    val doNotCompress: List<String>? = null
)