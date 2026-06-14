package com.nitrasoftware.nitraquran

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
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
Column {
Text(text = "مرحبا بكم في Nitra Quran. Bienvenue dans Nitra Quran. Bienvenido a Nitra Quran.")
Button(onClick = { reproducir(contexto, R.raw.s1) }) {Text(text = "1. الفاتحة")}
Button(onClick = { reproducir(contexto, R.raw.s2) }) {Text(text = "2. البقرة")}
Button(onClick = { reproducir(contexto, R.raw.s3) }) {Text(text = "3. آل عمران")}
Button(onClick = { reproducir(contexto, R.raw.s4) }) {Text(text = "4. النساء")}
Button(onClick = { reproducir(contexto, R.raw.s5) }) {Text(text = "5. المائدة")}
Button(onClick = { reproducir(contexto, R.raw.s6) }) {Text(text = "6. الأنعام")}
Button(onClick = { reproducir(contexto, R.raw.s7) }) {Text(text = "7. الأعراف")}
Button(onClick = { reproducir(contexto, R.raw.s8) }) {Text(text = "8. الأنفال")}
Button(onClick = { reproducir(contexto, R.raw.s9) }) {Text(text = "9. التوبة")}
Button(onClick = { reproducir(contexto, R.raw.s10) }) {Text(text = "10. يونس")}
Button(onClick = { reproducir(contexto, R.raw.s11) }) {Text(text = "11. هود")}
Button(onClick = { reproducir(contexto, R.raw.s12) }) {Text(text = "12. يوسف")}
Button(onClick = { reproducir(contexto, R.raw.s13) }) {Text(text = "13. الرعد")}
Button(onClick = { reproducir(contexto, R.raw.s14) }) {Text(text = "14. ابراهيم")}
Button(onClick = { reproducir(contexto, R.raw.s15) }) {Text(text = "15. الحجر")}
Button(onClick = { reproducir(contexto, R.raw.s16) }) {Text(text = "16. النحل")}
Button(onClick = { reproducir(contexto, R.raw.s17) }) {Text(text = "17. الإسراء")}
Button(onClick = { reproducir(contexto, R.raw.s18) }) {Text(text = "18. الكهف")}
Button(onClick = { reproducir(contexto, R.raw.s19) }) {Text(text = "19. مريم")}
Button(onClick = { reproducir(contexto, R.raw.s20) }) {Text(text = "20. طه")}
Button(onClick = { reproducir(contexto, R.raw.s21) }) {Text(text = "21. الأنبياء")}
Button(onClick = { reproducir(contexto, R.raw.s22) }) {Text(text = "22. الحج")}
Button(onClick = { reproducir(contexto, R.raw.s23) }) {Text(text = "23. المؤمنون")}
Button(onClick = { reproducir(contexto, R.raw.s24) }) {Text(text = "24. النور")}
Button(onClick = { reproducir(contexto, R.raw.s25) }) {Text(text = "25. الفرقان")}
Button(onClick = { reproducir(contexto, R.raw.s26) }) {Text(text = "26. الشعراء")}
Button(onClick = { reproducir(contexto, R.raw.s27) }) {Text(text = "27. النمل")}
Button(onClick = { reproducir(contexto, R.raw.s28) }) {Text(text = "28. القصص")}
Button(onClick = { reproducir(contexto, R.raw.s29) }) {Text(text = "29. العنكبوت")}
Button(onClick = { reproducir(contexto, R.raw.s30) }) {Text(text = "30. الروم")}
Button(onClick = { reproducir(contexto, R.raw.s31) }) {Text(text = "31. لقمان")}
Button(onClick = { reproducir(contexto, R.raw.s32) }) {Text(text = "32. السجدة")}
Button(onClick = { reproducir(contexto, R.raw.s33) }) {Text(text = "33. الأحزاب")}
Button(onClick = { reproducir(contexto, R.raw.s34) }) {Text(text = "34. سبأ")}
Button(onClick = { reproducir(contexto, R.raw.s35) }) {Text(text = "35. فاطر")}
Button(onClick = { reproducir(contexto, R.raw.s36) }) {Text(text = "36. يس")}
Button(onClick = { reproducir(contexto, R.raw.s37) }) {Text(text = "37. الصافات")}
Button(onClick = { reproducir(contexto, R.raw.s38) }) {Text(text = "38. ص")}
Button(onClick = { reproducir(contexto, R.raw.s39) }) {Text(text = "39. الزمر")}
Button(onClick = { reproducir(contexto, R.raw.s40) }) {Text(text = "40. غافر")}
Button(onClick = { reproducir(contexto, R.raw.s41) }) {Text(text = "41. فصلت")}
Button(onClick = { reproducir(contexto, R.raw.s42) }) {Text(text = "42. الشورى")}
Button(onClick = { reproducir(contexto, R.raw.s43) }) {Text(text = "43. الزخرف")}
Button(onClick = { reproducir(contexto, R.raw.s44) }) {Text(text = "44. الدخان")}
Button(onClick = { reproducir(contexto, R.raw.s45) }) {Text(text = "45. الجاثية")}
Button(onClick = { reproducir(contexto, R.raw.s46) }) {Text(text = "46. الأحقاف")}
Button(onClick = { reproducir(contexto, R.raw.s47) }) {Text(text = "47. محمد")}
Button(onClick = { reproducir(contexto, R.raw.s48) }) {Text(text = "48. الفتح")}
Button(onClick = { reproducir(contexto, R.raw.s49) }) {Text(text = "49. الحجرات")}
Button(onClick = { reproducir(contexto, R.raw.s50) }) {Text(text = "50. ق")}
Button(onClick = { reproducir(contexto, R.raw.s51) }) {Text(text = "51. الذاريات")}
Button(onClick = { reproducir(contexto, R.raw.s52) }) {Text(text = "52. الطور")}
Button(onClick = { reproducir(contexto, R.raw.s53) }) {Text(text = "53. النجم")}
Button(onClick = { reproducir(contexto, R.raw.s54) }) {Text(text = "54. القمر")}
Button(onClick = { reproducir(contexto, R.raw.s55) }) {Text(text = "55. الرحمن")}
Button(onClick = { reproducir(contexto, R.raw.s56) }) {Text(text = "56. الواقعة")}
Button(onClick = { reproducir(contexto, R.raw.s57) }) {Text(text = "57. الحديد")}
Button(onClick = { reproducir(contexto, R.raw.s58) }) {Text(text = "58. المجادلة")}
Button(onClick = { reproducir(contexto, R.raw.s59) }) {Text(text = "59. الحشر")}
Button(onClick = { reproducir(contexto, R.raw.s60) }) {Text(text = "60. الممتحنة")}
Button(onClick = { reproducir(contexto, R.raw.s61) }) {Text(text = "61. الصف")}
Button(onClick = { reproducir(contexto, R.raw.s62) }) {Text(text = "62. الجمعة")}
Button(onClick = { reproducir(contexto, R.raw.s63) }) {Text(text = "63. المنافقون")}
Button(onClick = { reproducir(contexto, R.raw.s64) }) {Text(text = "64. التغابن")}
Button(onClick = { reproducir(contexto, R.raw.s65) }) {Text(text = "65. الطلاق")}
Button(onClick = { reproducir(contexto, R.raw.s66) }) {Text(text = "66. التحريم")}
Button(onClick = { reproducir(contexto, R.raw.s67) }) {Text(text = "67. الملك")}
Button(onClick = { reproducir(contexto, R.raw.s68) }) {Text(text = "68. القلم")}
Button(onClick = { reproducir(contexto, R.raw.s69) }) {Text(text = "69. الحاقة")}
Button(onClick = { reproducir(contexto, R.raw.s70) }) {Text(text = "70. المعارج")}
Button(onClick = { reproducir(contexto, R.raw.s71) }) {Text(text = "71. نوح")}
Button(onClick = { reproducir(contexto, R.raw.s72) }) {Text(text = "72. الجن")}
Button(onClick = { reproducir(contexto, R.raw.s73) }) {Text(text = "73. المزمل")}
Button(onClick = { reproducir(contexto, R.raw.s74) }) {Text(text = "74. المدثر")}
Button(onClick = { reproducir(contexto, R.raw.s75) }) {Text(text = "75. القيامة")}
Button(onClick = { reproducir(contexto, R.raw.s76) }) {Text(text = "76. الإنسان")}
Button(onClick = { reproducir(contexto, R.raw.s77) }) {Text(text = "77. المرسلات")}
Button(onClick = { reproducir(contexto, R.raw.s78) }) {Text(text = "78. النبأ")}
Button(onClick = { reproducir(contexto, R.raw.s79) }) {Text(text = "79. النازعات")}
Button(onClick = { reproducir(contexto, R.raw.s80) }) {Text(text = "80. عبس")}
Button(onClick = { reproducir(contexto, R.raw.s81) }) {Text(text = "81. التكوير")}
Button(onClick = { reproducir(contexto, R.raw.s82) }) {Text(text = "82. الإنفطار")}
Button(onClick = { reproducir(contexto, R.raw.s83) }) {Text(text = "83. المطففين")}
Button(onClick = { reproducir(contexto, R.raw.s84) }) {Text(text = "84. الإنشقاق")}
Button(onClick = { reproducir(contexto, R.raw.s85) }) {Text(text = "85. البروج")}
Button(onClick = { reproducir(contexto, R.raw.s86) }) {Text(text = "86. الطارق")}
Button(onClick = { reproducir(contexto, R.raw.s87) }) {Text(text = "87. الأعلى")}
Button(onClick = { reproducir(contexto, R.raw.s88) }) {Text(text = "88. الغاشية")}
Button(onClick = { reproducir(contexto, R.raw.s89) }) {Text(text = "89. الفجر")}
Button(onClick = { reproducir(contexto, R.raw.s90) }) {Text(text = "90. البلد")}
Button(onClick = { reproducir(contexto, R.raw.s91) }) {Text(text = "91. الشمس")}
Button(onClick = { reproducir(contexto, R.raw.s92) }) {Text(text = "92. الليل")}
Button(onClick = { reproducir(contexto, R.raw.s93) }) {Text(text = "93. الضحى")}
Button(onClick = { reproducir(contexto, R.raw.s94) }) {Text(text = "94. الشرح")}
Button(onClick = { reproducir(contexto, R.raw.s95) }) {Text(text = "95. التين")}
Button(onClick = { reproducir(contexto, R.raw.s96) }) {Text(text = "96. العلق")}
Button(onClick = { reproducir(contexto, R.raw.s97) }) {Text(text = "97. القدر")}
Button(onClick = { reproducir(contexto, R.raw.s98) }) {Text(text = "98. البينة")}
Button(onClick = { reproducir(contexto, R.raw.s99) }) {Text(text = "99. الزلزلة")}
Button(onClick = { reproducir(contexto, R.raw.s100) }) {Text(text = "100. العاديات")}
Button(onClick = { reproducir(contexto, R.raw.s101) }) {Text(text = "101. القارعة")}
Button(onClick = { reproducir(contexto, R.raw.s102) }) {Text(text = "102. التكاثر")}
Button(onClick = { reproducir(contexto, R.raw.s103) }) {Text(text = "103. العصر")}
Button(onClick = { reproducir(contexto, R.raw.s104) }) {Text(text = "104. الهمزة")}
Button(onClick = { reproducir(contexto, R.raw.s105) }) {Text(text = "105. الفيل")}
Button(onClick = { reproducir(contexto, R.raw.s106) }) {Text(text = "106. قريش")}
Button(onClick = { reproducir(contexto, R.raw.s107) }) {Text(text = "107. الماعون")}
Button(onClick = { reproducir(contexto, R.raw.s108) }) {Text(text = "108. الكوثر")}
Button(onClick = { reproducir(contexto, R.raw.s109) }) {Text(text = "109. الكافرون")}
Button(onClick = { reproducir(contexto, R.raw.s110) }) {Text(text = "110. النصر")}
Button(onClick = { reproducir(contexto, R.raw.s111) }) {Text(text = "111. المسد")}
Button(onClick = { reproducir(contexto, R.raw.s112) }) {Text(text = "112. الإخلاص")}
Button(onClick = { reproducir(contexto, R.raw.s113) }) {Text(text = "113. الفلق")}
Button(onClick = { reproducir(contexto, R.raw.s114) }) {Text(text = "114. الناس")}
}
}