package com.example.practiceui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(
            route = BottomBarScreen.Home.route
        ){
            Home()
        }
        composable(
            route = BottomBarScreen.Profile.route
        ){
            Profile()
        }
        composable(
            route = BottomBarScreen.Setting.route
        ){
            Setting()
        }

    }
}