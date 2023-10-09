package com.example.stptest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.stptest.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // Create a NavController
                val navController = rememberNavController()

                // Create a NavHost with the NavController
                NavHost(navController, startDestination = "welcome") {
                    composable("welcome") { WelcomeContent("AppName",navController = navController) }
                    composable("signup") { SignUpContent(navController) }
                    composable("login") { LogInContent(navController) }
                }
            }
        }
    }
}
