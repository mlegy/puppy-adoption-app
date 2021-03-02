package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.transform.RoundedCornersTransformation
import com.example.androiddevchallenge.data.PetsData
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetDetails(petId: String) {
    LaunchedEffect(petId) {
        PetsData.getPet(petId)
    }

    val petState = PetsData.petLiveData.observeAsState()
    val pet = petState.value


    if (pet != null) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Photo(photoUrl = pet.photo)

            Name(name = pet.name)

            Spacer(modifier = Modifier.size(8.dp))

            Address(address = pet.address)

            Age(age = pet.age)

            Gender(gender = pet.gender)

            Weight(weight = pet.weight)

            About(pet.bio)

            AdoptButton()
        }
    }
}

@Composable
fun Photo(photoUrl: String) {
    val radius = 10.dp.value * LocalDensity.current.density

    CoilImage(
        data = photoUrl,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(320.dp)
            .fillMaxWidth(),
        contentDescription = null,
        requestBuilder = {
            transformations(RoundedCornersTransformation(0f, 0f, radius, radius))
        }
    )
}

@Composable
fun Name(name: String) {
    Text(
        text = name,
        modifier = Modifier.padding(8.dp),
        style = TextStyle(fontSize = 24.sp)
    )
}

@Composable
fun Address(address: String) {
    Text(
        text = address,
        Modifier
            .padding(8.dp)
            .fillMaxWidth()
    )
}

@Composable
fun Age(age: String) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Age",
            modifier = Modifier.padding(8.dp),
            style = TextStyle(fontSize = 20.sp)
        )
        Text(text = age, modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun Gender(gender: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Gender",
            modifier = Modifier.padding(8.dp),
            style = TextStyle(fontSize = 20.sp)
        )
        Text(text = gender, modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun Weight(weight: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Weight",
            modifier = Modifier.padding(8.dp),
            style = TextStyle(fontSize = 20.sp)
        )
        Text(text = weight, modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun About(bio: String) {
    Text(
        text = "About",
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        style = TextStyle(fontSize = 20.sp)
    )
    Text(text = bio, modifier = Modifier.padding(8.dp))

}

@Composable
fun AdoptButton() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Button(
            onClick = { }, modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Adopt")
        }
    }
}

@Preview("Pet details", widthDp = 360, heightDp = 640)
@Composable
fun PetDetails() {
    MyTheme(darkTheme = false) {
        PetDetails("id_1")
    }
}
