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
