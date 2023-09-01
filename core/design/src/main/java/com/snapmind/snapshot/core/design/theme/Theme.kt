package com.snapmind.snapshot.core.design.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

val LightAndroidColorScheme = lightColorScheme()
val DarkAndroidColorScheme = darkColorScheme()

@Suppress("UNUSED_PARAMETER")
@Composable
fun SnapshotTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    androidTheme: Boolean = false,
    disableDynamicTheming: Boolean = true,
    content: @Composable () -> Unit
) {

    val colorScheme = if (darkTheme) DarkAndroidColorScheme else LightAndroidColorScheme

    CompositionLocalProvider {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = SnapshotTypography,
            content = content
        )
    }
}