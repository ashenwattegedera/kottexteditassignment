package com.example.codeeditor.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,

    // Optional: you can override background and surface for a full dark look
    background = PurpleGrey40,
    surface = PurpleGrey40,
    onPrimary = PurpleGrey40,
    onSecondary = Purple80,
    onTertiary = PurpleGrey80,
    onBackground = Pink40,
    onSurface = Pink40
)

@Composable
fun CodeEditorTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}
