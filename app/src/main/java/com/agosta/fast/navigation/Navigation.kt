/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.agosta.fast.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.agosta.fast.ui.home.HomeScreen

object NavigationDestinations {
    const val HOME_ROUTE = "HOME_ROUTE"
}

@Composable
fun MainNavigation(navController: NavHostController = rememberNavController()) {

    NavHost(navController = navController, startDestination = NavigationDestinations.HOME_ROUTE) {
        composable(NavigationDestinations.HOME_ROUTE) {
            HomeScreen(modifier = Modifier
                .testTag(NavigationDestinations.HOME_ROUTE)
                .padding(16.dp)
            )
        }
    }
}
