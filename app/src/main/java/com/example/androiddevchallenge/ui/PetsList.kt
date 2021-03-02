/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.Pet

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PetsList(navController: NavHostController, pets: List<Pet>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Pets Adoption") },
                modifier = Modifier.background(Color.White)
            )
        },
        content = {
            LazyVerticalGrid(cells = GridCells.Fixed(2)) {
                items(pets) { pet ->
                    PetItem(pet) { navController.navigate("pet/${it.id}") }
                }
            }
        }
    )
}
