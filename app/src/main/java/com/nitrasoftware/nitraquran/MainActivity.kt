package com.nitrasoftware.nitraquran

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
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
val contexto = LocalContext.current
LazyColumn {
item { Text(text = "مرحبا بكم في Nitra Quran. Bienvenue dans Nitra Quran. Bienvenido a Nitra Quran.") }
item { Button(onClick = { reproducir(contexto, R.raw.s1) }) {Text(text = "1. الفاتحة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s2) }) {Text(text = "2. البقرة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s3) }) {Text(text = "3. آل عمران")} }
item { Button(onClick = { reproducir(contexto, R.raw.s4) }) {Text(text = "4. النساء")} }
item { Button(onClick = { reproducir(contexto, R.raw.s5) }) {Text(text = "5. المائدة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s6) }) {Text(text = "6. الأنعام")} }
item { Button(onClick = { reproducir(contexto, R.raw.s7) }) {Text(text = "7. الأعراف")} }
item { Button(onClick = { reproducir(contexto, R.raw.s8) }) {Text(text = "8. الأنفال")} }
item { Button(onClick = { reproducir(contexto, R.raw.s9) }) {Text(text = "9. التوبة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s10) }) {Text(text = "10. يونس")} }
item { Button(onClick = { reproducir(contexto, R.raw.s11) }) {Text(text = "11. هود")} }
item { Button(onClick = { reproducir(contexto, R.raw.s12) }) {Text(text = "12. يوسف")} }
item { Button(onClick = { reproducir(contexto, R.raw.s13) }) {Text(text = "13. الرعد")} }
item { Button(onClick = { reproducir(contexto, R.raw.s14) }) {Text(text = "14. ابراهيم")} }
item { Button(onClick = { reproducir(contexto, R.raw.s15) }) {Text(text = "15. الحجر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s16) }) {Text(text = "16. النحل")} }
item { Button(onClick = { reproducir(contexto, R.raw.s17) }) {Text(text = "17. الإسراء")} }
item { Button(onClick = { reproducir(contexto, R.raw.s18) }) {Text(text = "18. الكهف")} }
item { Button(onClick = { reproducir(contexto, R.raw.s19) }) {Text(text = "19. مريم")} }
item { Button(onClick = { reproducir(contexto, R.raw.s20) }) {Text(text = "20. طه")} }
item { Button(onClick = { reproducir(contexto, R.raw.s21) }) {Text(text = "21. الأنبياء")} }
item { Button(onClick = { reproducir(contexto, R.raw.s22) }) {Text(text = "22. الحج")} }
item { Button(onClick = { reproducir(contexto, R.raw.s23) }) {Text(text = "23. المؤمنون")} }
item { Button(onClick = { reproducir(contexto, R.raw.s24) }) {Text(text = "24. النور")} }
item { Button(onClick = { reproducir(contexto, R.raw.s25) }) {Text(text = "25. الفرقان")} }
item { Button(onClick = { reproducir(contexto, R.raw.s26) }) {Text(text = "26. الشعراء")} }
item { Button(onClick = { reproducir(contexto, R.raw.s27) }) {Text(text = "27. النمل")} }
item { Button(onClick = { reproducir(contexto, R.raw.s28) }) {Text(text = "28. القصص")} }
item { Button(onClick = { reproducir(contexto, R.raw.s29) }) {Text(text = "29. العنكبوت")} }
item { Button(onClick = { reproducir(contexto, R.raw.s30) }) {Text(text = "30. الروم")} }
item { Button(onClick = { reproducir(contexto, R.raw.s31) }) {Text(text = "31. لقمان")} }
item { Button(onClick = { reproducir(contexto, R.raw.s32) }) {Text(text = "32. السجدة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s33) }) {Text(text = "33. الأحزاب")} }
item { Button(onClick = { reproducir(contexto, R.raw.s34) }) {Text(text = "34. سبأ")} }
item { Button(onClick = { reproducir(contexto, R.raw.s35) }) {Text(text = "35. فاطر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s36) }) {Text(text = "36. يس")} }
item { Button(onClick = { reproducir(contexto, R.raw.s37) }) {Text(text = "37. الصافات")} }
item { Button(onClick = { reproducir(contexto, R.raw.s38) }) {Text(text = "38. ص")} }
item { Button(onClick = { reproducir(contexto, R.raw.s39) }) {Text(text = "39. الزمر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s40) }) {Text(text = "40. غافر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s41) }) {Text(text = "41. فصلت")} }
item { Button(onClick = { reproducir(contexto, R.raw.s42) }) {Text(text = "42. الشورى")} }
item { Button(onClick = { reproducir(contexto, R.raw.s43) }) {Text(text = "43. الزخرف")} }
item { Button(onClick = { reproducir(contexto, R.raw.s44) }) {Text(text = "44. الدخان")} }
item { Button(onClick = { reproducir(contexto, R.raw.s45) }) {Text(text = "45. الجاثية")} }
item { Button(onClick = { reproducir(contexto, R.raw.s46) }) {Text(text = "46. الأحقاف")} }
item { Button(onClick = { reproducir(contexto, R.raw.s47) }) {Text(text = "47. محمد")} }
item { Button(onClick = { reproducir(contexto, R.raw.s48) }) {Text(text = "48. الفتح")} }
item { Button(onClick = { reproducir(contexto, R.raw.s49) }) {Text(text = "49. الحجرات")} }
item { Button(onClick = { reproducir(contexto, R.raw.s50) }) {Text(text = "50. ق")} }
item { Button(onClick = { reproducir(contexto, R.raw.s51) }) {Text(text = "51. الذاريات")} }
item { Button(onClick = { reproducir(contexto, R.raw.s52) }) {Text(text = "52. الطور")} }
item { Button(onClick = { reproducir(contexto, R.raw.s53) }) {Text(text = "53. النجم")} }
item { Button(onClick = { reproducir(contexto, R.raw.s54) }) {Text(text = "54. القمر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s55) }) {Text(text = "55. الرحمن")} }
item { Button(onClick = { reproducir(contexto, R.raw.s56) }) {Text(text = "56. الواقعة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s57) }) {Text(text = "57. الحديد")} }
item { Button(onClick = { reproducir(contexto, R.raw.s58) }) {Text(text = "58. المجادلة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s59) }) {Text(text = "59. الحشر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s60) }) {Text(text = "60. الممتحنة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s61) }) {Text(text = "61. الصف")} }
item { Button(onClick = { reproducir(contexto, R.raw.s62) }) {Text(text = "62. الجمعة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s63) }) {Text(text = "63. المنافقون")} }
item { Button(onClick = { reproducir(contexto, R.raw.s64) }) {Text(text = "64. التغابن")} }
item { Button(onClick = { reproducir(contexto, R.raw.s65) }) {Text(text = "65. الطلاق")} }
item { Button(onClick = { reproducir(contexto, R.raw.s66) }) {Text(text = "66. التحريم")} }
item { Button(onClick = { reproducir(contexto, R.raw.s67) }) {Text(text = "67. الملك")} }
item { Button(onClick = { reproducir(contexto, R.raw.s68) }) {Text(text = "68. القلم")} }
item { Button(onClick = { reproducir(contexto, R.raw.s69) }) {Text(text = "69. الحاقة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s70) }) {Text(text = "70. المعارج")} }
item { Button(onClick = { reproducir(contexto, R.raw.s71) }) {Text(text = "71. نوح")} }
item { Button(onClick = { reproducir(contexto, R.raw.s72) }) {Text(text = "72. الجن")} }
item { Button(onClick = { reproducir(contexto, R.raw.s73) }) {Text(text = "73. المزمل")} }
item { Button(onClick = { reproducir(contexto, R.raw.s74) }) {Text(text = "74. المدثر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s75) }) {Text(text = "75. القيامة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s76) }) {Text(text = "76. الإنسان")} }
item { Button(onClick = { reproducir(contexto, R.raw.s77) }) {Text(text = "77. المرسلات")} }
item { Button(onClick = { reproducir(contexto, R.raw.s78) }) {Text(text = "78. النبأ")} }
item { Button(onClick = { reproducir(contexto, R.raw.s79) }) {Text(text = "79. النازعات")} }
item { Button(onClick = { reproducir(contexto, R.raw.s80) }) {Text(text = "80. عبس")} }
item { Button(onClick = { reproducir(contexto, R.raw.s81) }) {Text(text = "81. التكوير")} }
item { Button(onClick = { reproducir(contexto, R.raw.s82) }) {Text(text = "82. الإنفطار")} }
item { Button(onClick = { reproducir(contexto, R.raw.s83) }) {Text(text = "83. المطففين")} }
item { Button(onClick = { reproducir(contexto, R.raw.s84) }) {Text(text = "84. الإنشقاق")} }
item { Button(onClick = { reproducir(contexto, R.raw.s85) }) {Text(text = "85. البروج")} }
item { Button(onClick = { reproducir(contexto, R.raw.s86) }) {Text(text = "86. الطارق")} }
item { Button(onClick = { reproducir(contexto, R.raw.s87) }) {Text(text = "87. الأعلى")} }
item { Button(onClick = { reproducir(contexto, R.raw.s88) }) {Text(text = "88. الغاشية")} }
item { Button(onClick = { reproducir(contexto, R.raw.s89) }) {Text(text = "89. الفجر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s90) }) {Text(text = "90. البلد")} }
item { Button(onClick = { reproducir(contexto, R.raw.s91) }) {Text(text = "91. الشمس")} }
item { Button(onClick = { reproducir(contexto, R.raw.s92) }) {Text(text = "92. الليل")} }
item { Button(onClick = { reproducir(contexto, R.raw.s93) }) {Text(text = "93. الضحى")} }
item { Button(onClick = { reproducir(contexto, R.raw.s94) }) {Text(text = "94. الشرح")} }
item { Button(onClick = { reproducir(contexto, R.raw.s95) }) {Text(text = "95. التين")} }
item { Button(onClick = { reproducir(contexto, R.raw.s96) }) {Text(text = "96. العلق")} }
item { Button(onClick = { reproducir(contexto, R.raw.s97) }) {Text(text = "97. القدر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s98) }) {Text(text = "98. البينة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s99) }) {Text(text = "99. الزلزلة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s100) }) {Text(text = "100. العاديات")} }
item { Button(onClick = { reproducir(contexto, R.raw.s101) }) {Text(text = "101. القارعة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s102) }) {Text(text = "102. التكاثر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s103) }) {Text(text = "103. العصر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s104) }) {Text(text = "104. الهمزة")} }
item { Button(onClick = { reproducir(contexto, R.raw.s105) }) {Text(text = "105. الفيل")} }
item { Button(onClick = { reproducir(contexto, R.raw.s106) }) {Text(text = "106. قريش")} }
item { Button(onClick = { reproducir(contexto, R.raw.s107) }) {Text(text = "107. الماعون")} }
item { Button(onClick = { reproducir(contexto, R.raw.s108) }) {Text(text = "108. الكوثر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s109) }) {Text(text = "109. الكافرون")} }
item { Button(onClick = { reproducir(contexto, R.raw.s110) }) {Text(text = "110. النصر")} }
item { Button(onClick = { reproducir(contexto, R.raw.s111) }) {Text(text = "111. المسد")} }
item { Button(onClick = { reproducir(contexto, R.raw.s112) }) {Text(text = "112. الإخلاص")} }
item { Button(onClick = { reproducir(contexto, R.raw.s113) }) {Text(text = "113. الفلق")} }
item { Button(onClick = { reproducir(contexto, R.raw.s114) }) {Text(text = "114. الناس")} }
}
}
