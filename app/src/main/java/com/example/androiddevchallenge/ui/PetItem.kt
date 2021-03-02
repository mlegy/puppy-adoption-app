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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import coil.transform.RoundedCornersTransformation
import com.example.androiddevchallenge.data.Pet
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetItem(pet: Pet, onPetClick: (Pet) -> Unit) {
    val radius = 10.dp.value * LocalDensity.current.density
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onPetClick(pet) },
        elevation = 5.dp,
        shape = RoundedCornerShape(CornerSize(10.dp))
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CoilImage(
                data = pet.photo,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(200.dp),
                contentDescription = null,
                requestBuilder = {
                    transformations(RoundedCornersTransformation(radius, radius, 0f, 0f))
                }
            )
            Text(text = pet.name, modifier = Modifier.padding(8.dp))
        }
    }
}
