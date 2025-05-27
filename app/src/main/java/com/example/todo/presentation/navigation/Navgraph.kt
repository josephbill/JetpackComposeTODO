package com.example.todo.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.todo.presentation.components.ForgotPassword
import com.example.todo.presentation.screens.apiscreens.ApiDashboard
import com.example.todo.presentation.screens.auth.LoginScreen
import com.example.todo.presentation.screens.auth.SignUpScreen
import com.example.todo.presentation.screens.dashboard.DashboardScreen

// INSIDE THIS FILE WE WILL DEFINE NAVCONTROLLER : THIS IS USED TO NAVIGATE
// TO DIFFERENT COMPOSABLES / SCREENS
@Composable
fun TodoNavGraph(navController: NavHostController){
      NavHost(navController = navController, startDestination = "signUp") {
          composable("signUp"){
              SignUpScreen(navController)
          }
          composable("login"){
              LoginScreen(navController)
          }
          composable("dashboard") {
              DashboardScreen(
                  //properties for the composable
                  navController
              )
          }
          composable("forgotpassword") {
              ForgotPassword(
                  navController
            )
          }

          composable("apiroute"){
              ApiDashboard(
                  navController
              )
          }


          // here will define the addtoDo composable

      }

}










