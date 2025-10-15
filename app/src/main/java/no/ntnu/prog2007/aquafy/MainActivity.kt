package no.ntnu.prog2007.aquafy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import no.ntnu.prog2007.aquafy.ui.theme.AppTheme
import no.ntnu.prog2007.aquafy.ui.AquafyApp

/**
 * Loads the home screen of the Aquafy application.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                AquafyApp()
            }
        }
    }
}
