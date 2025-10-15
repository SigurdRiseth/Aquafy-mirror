package no.ntnu.prog2007.aquafy.ui.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import no.ntnu.prog2007.aquafy.ui.screens.home.HomeScreen

/**
 * Navigation host for the Aquafy application.
 * It manages a [navController] responsible for navigating between different composable screens
 * in the app.
 *
 * Currently, the navigation host is set up to navigate to the home screen of the application.
 * Additional screens, such as aquarium management or profile screens, can be added later as needed.
 */
@Composable
fun ApplicationNavHost(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Home
    ) {
        composable<Home> {
            HomeScreen(
            )
        }
    }
}