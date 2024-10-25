package com.example.all_in_one.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.all_in_one.views.DYView
import com.example.all_in_one.views.DescuentoView
import com.example.all_in_one.views.HomeView
import com.example.all_in_one.views.LotoView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }

        composable("DY"){
            DYView(navController)
        }

        composable("Descuentos"){
            DescuentoView(navController)
        }

        composable("Loto"){
            LotoView(navController)
        }


    }
}