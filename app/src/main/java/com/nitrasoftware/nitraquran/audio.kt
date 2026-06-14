package com.nitrasoftware.nitraquran

import android.content.Context
import android.media.MediaPlayer

private var mediaPlayerActual: MediaPlayer? = null

fun reproducir(context: Context, archivoResId: Int) {
    mediaPlayerActual?.stop()
    mediaPlayerActual?.release()
    mediaPlayerActual = MediaPlayer.create(context, archivoResId)
    mediaPlayerActual?.start()
    mediaPlayerActual?.setOnCompletionListener {
        it.release()
        mediaPlayerActual = null
    }
}

fun detener() {
    mediaPlayerActual?.stop()
    mediaPlayerActual?.release()
    mediaPlayerActual = null
}

fun pausar() {
    mediaPlayerActual?.pause()
}

fun reanudar() {
    mediaPlayerActual?.start()
}