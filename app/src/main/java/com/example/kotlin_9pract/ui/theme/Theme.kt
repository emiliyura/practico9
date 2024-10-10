import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Определение собственных цветов
val MyCustomColors = lightColorScheme(
    primary = Color(0xFF4CAF50), // Зеленый
    secondary = Color(0xFF5CD715), // Синий
    background = Color(0xFF43E30C),
    surface =Color(0xFF3EE30E),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color(0xFF8AEE10),
    onSurface = Color.Black,
)

// Определение собственных шрифтов
val MyCustomTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
)

// Определение собственных форм (опционально)
// val MyCustomShapes = Shapes(
//     small = RoundedCornerShape(4.dp),
//     medium = RoundedCornerShape(4.dp),
//     large = RoundedCornerShape(0.dp)
// )

// Создание собственной темы
@Composable
fun MyCustomTheme(content: @Composable () -> Unit) {
    androidx.compose.material3.MaterialTheme(
        colorScheme = MyCustomColors,
        typography = MyCustomTypography,
        // shapes = MyCustomShapes,
        content = content
    )
}