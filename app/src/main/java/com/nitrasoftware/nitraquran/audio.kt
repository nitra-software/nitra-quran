import android.content.Context
import android.media.MediaPlayer

fun reproducir(context: Context, archivoResId: Int) {
val mediaPlayer = MediaPlayer.create(context, archivoResId)
mediaPlayer.start()
mediaPlayer.setOnCompletionListener {
it.release()
}
}