@file:JvmName("Utils")


/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 2/7/18
 */


val messageLoad = "Loading..."

fun progress(message: String = messageLoad,
             frames: List<String> = Frames.dots8,
             done: String = Frames.done,
             block: Progress.() -> Unit) {
    Progress(message, frames, done).apply {
        start { block(this) }
    }
}

internal fun clearLine() = print("\u001b[2K\u001b[${Short.MAX_VALUE}D")