package com.albinvpn.app.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.albinvpn.app.data.AccentShade
import com.albinvpn.app.data.ThemeMode

private val DarkText = Color(0xFFF6F2FF)
private val DarkMuted = Color(0xFFC2B7DC)
private val LightText = Color(0xFF181226)
private val LightMuted = Color(0xFF544B6B)

private val PurpleDark = darkColorScheme(
    primary = Color(0xFFC084FC), onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF5B21B6), onPrimaryContainer = Color(0xFFF3E8FF),
    secondary = Color(0xFFA78BFA), onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFF3B1F6E), onSecondaryContainer = Color(0xFFEDE9FE),
    tertiary = Color(0xFFF472B6), onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFF090711), onBackground = DarkText,
    surface = Color(0xFF090711), onSurface = DarkText,
    surfaceVariant = Color(0xFF1B1530), onSurfaceVariant = DarkMuted,
    surfaceContainer = Color(0xFF161128), surfaceContainerHigh = Color(0xFF221A3C),
    outline = Color(0xFF5A4985), outlineVariant = Color(0xFF392D5C)
)

private val PurpleLight = lightColorScheme(
    primary = Color(0xFF7C3AED), onPrimary = Color.White,
    primaryContainer = Color(0xFFEDE9FE), onPrimaryContainer = Color(0xFF2E1065),
    tertiary = Color(0xFFEC4899), onTertiary = Color.White,
    background = Color(0xFFFAF7FF), onBackground = LightText,
    surface = Color(0xFFFAF7FF), onSurface = LightText,
    surfaceVariant = Color(0xFFEDE6FA), onSurfaceVariant = LightMuted,
    surfaceContainer = Color(0xFFF3ECFF), surfaceContainerHigh = Color(0xFFE9DDFC),
    outlineVariant = Color(0xFFD5C4F2)
)

private val UltraDark = darkColorScheme(
    primary = Color(0xFFD8B4FE), onPrimary = Color(0xFF1F0642),
    primaryContainer = Color(0xFF7E22CE), onPrimaryContainer = Color(0xFFFAF5FF),
    tertiary = Color(0xFF38BDF8), onTertiary = Color(0xFF082F49),
    background = Color(0xFF080510), onBackground = DarkText,
    surface = Color(0xFF080510), onSurface = DarkText,
    surfaceVariant = Color(0xFF1B1130), onSurfaceVariant = DarkMuted,
    surfaceContainer = Color(0xFF160E28), surfaceContainerHigh = Color(0xFF251742),
    outlineVariant = Color(0xFF4C2B80)
)

private val UltraLight = lightColorScheme(
    primary = Color(0xFF9333EA), onPrimary = Color.White,
    primaryContainer = Color(0xFFF3E8FF), onPrimaryContainer = Color(0xFF3B0764),
    tertiary = Color(0xFF0284C7), onTertiary = Color.White,
    background = Color(0xFFFDF8FF), onBackground = LightText,
    surface = Color(0xFFFDF8FF), onSurface = LightText,
    surfaceVariant = Color(0xFFF2E6FE), onSurfaceVariant = LightMuted,
    surfaceContainer = Color(0xFFF6ECFF), surfaceContainerHigh = Color(0xFFEBD9FD)
)

private val BlueDark = darkColorScheme(
    primary = Color(0xFF60A5FA), onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF1D4ED8), onPrimaryContainer = Color(0xFFDBEAFE),
    tertiary = Color(0xFFA78BFA), onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFF070B14), onBackground = DarkText,
    surface = Color(0xFF070B14), onSurface = DarkText,
    surfaceVariant = Color(0xFF131D33), onSurfaceVariant = Color(0xFFB3C5E6),
    surfaceContainer = Color(0xFF101829), surfaceContainerHigh = Color(0xFF192640),
    outlineVariant = Color(0xFF2D426B)
)

private val BlueLight = lightColorScheme(
    primary = Color(0xFF1A73E8), onPrimary = Color.White,
    primaryContainer = Color(0xFFD2E3FC), onPrimaryContainer = Color(0xFF001D36),
    tertiary = Color(0xFF7C3AED), onTertiary = Color.White,
    background = Color(0xFFF8FAFF), onBackground = LightText,
    surface = Color(0xFFF8FAFF), onSurface = LightText,
    surfaceVariant = Color(0xFFE6EEFA), onSurfaceVariant = LightMuted,
    surfaceContainer = Color(0xFFECF2FC), surfaceContainerHigh = Color(0xFFDFEAFA)
)

private val EmeraldDark = darkColorScheme(
    primary = Color(0xFF2DD4BF), onPrimary = Color(0xFF042F2E),
    primaryContainer = Color(0xFF0F766E), onPrimaryContainer = Color(0xFFCCFBF1),
    tertiary = Color(0xFF818CF8), onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFF061110), onBackground = DarkText,
    surface = Color(0xFF061110), onSurface = DarkText,
    surfaceVariant = Color(0xFF102624), onSurfaceVariant = Color(0xFFAAD4CE),
    surfaceContainer = Color(0xFF0E1F1D), surfaceContainerHigh = Color(0xFF16302D),
    outlineVariant = Color(0xFF26524D)
)

private val EmeraldLight = lightColorScheme(
    primary = Color(0xFF0D9488), onPrimary = Color.White,
    primaryContainer = Color(0xFFCCFBF1), onPrimaryContainer = Color(0xFF042F2E),
    tertiary = Color(0xFF6366F1), onTertiary = Color.White,
    background = Color(0xFFF4FCFA), onBackground = LightText,
    surface = Color(0xFFF4FCFA), onSurface = LightText,
    surfaceVariant = Color(0xFFE1F2EE), onSurfaceVariant = LightMuted,
    surfaceContainer = Color(0xFFE6F4F1), surfaceContainerHigh = Color(0xFFD7ECE7)
)

private val RoseDark = darkColorScheme(
    primary = Color(0xFFF472B6), onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF9D174D), onPrimaryContainer = Color(0xFFFCE7F3),
    tertiary = Color(0xFFC084FC), onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFF13080E), onBackground = DarkText,
    surface = Color(0xFF13080E), onSurface = DarkText,
    surfaceVariant = Color(0xFF291220), onSurfaceVariant = Color(0xFFE2B8CE),
    surfaceContainer = Color(0xFF210F19), surfaceContainerHigh = Color(0xFF331827),
    outlineVariant = Color(0xFF5C2B46)
)

private val RoseLight = lightColorScheme(
    primary = Color(0xFFDB2777), onPrimary = Color.White,
    primaryContainer = Color(0xFFFCE7F3), onPrimaryContainer = Color(0xFF500724),
    tertiary = Color(0xFF9333EA), onTertiary = Color.White,
    background = Color(0xFFFFF8FA), onBackground = LightText,
    surface = Color(0xFFFFF8FA), onSurface = LightText,
    surfaceVariant = Color(0xFFFCE4EE), onSurfaceVariant = LightMuted,
    surfaceContainer = Color(0xFFFCEBF2), surfaceContainerHigh = Color(0xFFF8DCE7)
)

private val AmberDark = darkColorScheme(
    primary = Color(0xFFFBBF24), onPrimary = Color(0xFF2E1202),
    primaryContainer = Color(0xFF92400E), onPrimaryContainer = Color(0xFFFEF3C7),
    tertiary = Color(0xFFFB7185), onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFF120C06), onBackground = DarkText,
    surface = Color(0xFF120C06), onSurface = DarkText,
    surfaceVariant = Color(0xFF291D10), onSurfaceVariant = Color(0xFFE2C9AE),
    surfaceContainer = Color(0xFF21170D), surfaceContainerHigh = Color(0xFF332415),
    outlineVariant = Color(0xFF5C4226)
)

private val AmberLight = lightColorScheme(
    primary = Color(0xFFD97706), onPrimary = Color.White,
    primaryContainer = Color(0xFFFEF3C7), onPrimaryContainer = Color(0xFF451A03),
    tertiary = Color(0xFFE11D48), onTertiary = Color.White,
    background = Color(0xFFFFFAF4), onBackground = LightText,
    surface = Color(0xFFFFFAF4), onSurface = LightText,
    surfaceVariant = Color(0xFFF7EADC), onSurfaceVariant = LightMuted,
    surfaceContainer = Color(0xFFF9EFE1), surfaceContainerHigh = Color(0xFFF2E2CC)
)

@Composable
fun AlbinVpnTheme(
    themeMode: ThemeMode,
    accentShade: AccentShade,
    content: @Composable () -> Unit
) {
    val darkTheme = when (themeMode) {
        ThemeMode.SYSTEM -> isSystemInDarkTheme()
        ThemeMode.LIGHT -> false
        ThemeMode.DARK -> true
    }

    val context = LocalContext.current
    val colorScheme = if (accentShade == AccentShade.SYSTEM_DYNAMIC && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
    } else {
        when (accentShade) {
            AccentShade.PURPLE, AccentShade.SYSTEM_DYNAMIC -> if (darkTheme) PurpleDark else PurpleLight
            AccentShade.ULTRAVIOLET -> if (darkTheme) UltraDark else UltraLight
            AccentShade.OCEAN_BLUE -> if (darkTheme) BlueDark else BlueLight
            AccentShade.EMERALD -> if (darkTheme) EmeraldDark else EmeraldLight
            AccentShade.ROSE -> if (darkTheme) RoseDark else RoseLight
            AccentShade.AMBER -> if (darkTheme) AmberDark else AmberLight
        }
    }

    MaterialTheme(colorScheme = colorScheme, content = content)
}
