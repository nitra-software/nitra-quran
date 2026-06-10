package com.nitrasoftware.nitraquran

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
LazyColumn() {
item {Text(text = "مرحبا بكم في Nitra Quran. Bienvenue dans Nitra Quran. Bienvenido a Nitra Quran.")}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=pK0oKsQRR2w") }) {Text(text = "1. الفاتحة")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=h2msf6ZumvQ") }) {Text(text = "2. البقرة")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=gps_SaN1jc8") }) {Text(text = "3. ال عمران")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=gqrQGC2YEU8") }) {Text(text = "4. النساء")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=Qg26JvyKJaA") }) {Text(text = "5. المائدة")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=8ruPQQsG0Vk") }) {Text(text = "6. الأنعام")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=44nG3QEahPc") }) {Text(text = "7. الأعراف")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=lzRuS6DeWuk") }) {Text(text = "8. الأنفال")}}
item {Button(onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=0rrWG3RQkNM") }) {Text(text = "10. يونس")}}

}
}