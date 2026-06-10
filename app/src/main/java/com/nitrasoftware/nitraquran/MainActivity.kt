package com.nitrasoftware.nitraquran

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalUriHandler
import com.nitrasoftware.nitraquran.ui.theme.NitraQuranTheme

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContent {
NitraQuranTheme {
interfaz()
}
}
}
}

@Composable
fun interfaz() {
val uriHandler = LocalUriHandler.current
Row(
verticalAlignment = Alignment.CenterVertically,
horizontalArrangement = Arrangement.SpaceEvenly
) {
Text(text = "مرحبا بكم في quran audio. Bienvenue dans quran audio. Bienvenido a quran audio")
Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=pK0oKsQRR2w") }) {
Text(text = "1. سورة الفاتحة")
}
}
}