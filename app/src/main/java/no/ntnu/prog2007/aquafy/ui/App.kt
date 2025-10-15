package no.ntnu.prog2007.aquafy.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import no.ntnu.prog2007.aquafy.ui.navigation.ApplicationNavHost

/**
 * Launches the Aquafy application and sets up the navigation controller
 * used to navigate between different screens in the app.
 *
 * The [navController] is remembered across recompositions and is passed
 * to [ApplicationNavHost] to manage navigation within the app.
 */
@Composable
fun AquafyApp() {
    val navController = rememberNavController()

    ApplicationNavHost(
        navController = navController
    )
}
