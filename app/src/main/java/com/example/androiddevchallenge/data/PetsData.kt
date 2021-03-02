package com.example.androiddevchallenge.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object PetsData {
    fun getPetsData() = listOf(
        Pet(
            id = "id_1",
            name = "Splinter",
            photo = "https://images.unsplash.com/photo-1583511655857-d19b40a7a54e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2249&q=80",
            gender = "Male",
            address = "Austin, TX, USA",
            age = "4 months",
            weight = "2.5 KG",
            bio = "Splinter came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_2",
            name = "Shi",
            photo = "https://images.unsplash.com/photo-1537151608828-ea2b11777ee8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1239&q=80",
            gender = "Female",
            address = "3388 Sichen Hwy, Songjiang Qu, Shanghai Shi, China",
            age = "3 months",
            weight = "1.5 KG",
            bio = "Shi came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_3",
            name = "Oscar",
            photo = "https://images.unsplash.com/photo-1530281700549-e82e7bf110d6?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80",
            gender = "Male",
            address = "Pagham, United Kingdom",
            age = "2 months",
            weight = "3.5 KG",
            bio = "Oscar came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_4",
            name = "Crank",
            photo = "https://images.unsplash.com/photo-1527526029430-319f10814151?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2250&q=80",
            gender = "Female",
            address = "Itajubá, Brazil",
            age = "1.5 months",
            weight = "1 KG",
            bio = "Crank came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_5",
            name = "Cagle",
            photo = "https://images.unsplash.com/photo-1575859431774-2e57ed632664?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80",
            gender = "Female",
            address = "NY, USA",
            age = "2 months",
            weight = "1.5 KG",
            bio = "Cagle came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_6",
            name = "Jamie",
            photo = "https://images.unsplash.com/photo-1581888227599-779811939961?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2167&q=80",
            gender = "Male",
            address = "Berlin, Germany",
            age = "4.5 months",
            weight = "4 KG",
            bio = "Jamie came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_7",
            name = "Sweet",
            photo = "https://images.unsplash.com/photo-1514984879728-be0aff75a6e8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2176&q=80",
            gender = "Female",
            address = "Surrey Hills Area of Outstanding Natural Beauty, Dorking, United Kingdom",
            age = "2.5 months",
            weight = "2 KG",
            bio = "Sweet came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_8",
            name = "Crank",
            photo = "https://images.unsplash.com/photo-1527526029430-319f10814151?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2250&q=80",
            gender = "Female",
            address = "Itajubá, Brazil",
            age = "1.5 months",
            weight = "1 KG",
            bio = "Crank came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_9",
            name = "Angelo",
            photo = "https://images.unsplash.com/photo-1561312176-5aedf7172115?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=933&q=80",
            gender = "Male",
            address = "Sydney, Australia",
            age = "2.5 months",
            weight = "2 KG",
            bio = "Angelo came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        ),
        Pet(
            id = "id_10",
            name = "Fred",
            photo = "https://images.unsplash.com/photo-1516371535707-512a1e83bb9a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=934&q=80",
            gender = "Female",
            address = "Djurgården, Stockholm, Sweden",
            age = "2.5 months",
            weight = "3 KG",
            bio = "Fred came to us on May 8, 2020 from Glassville where he'd been part of a colony of feral cats that was trying survive. Splinter was born about August 7, 2010, so was about eight years old. In his life he had sustained several wounds and injuries. Today he displayed a very badly infected ear. It was extremely infected and he needed help."
        )
    )

    private val _petLiveData = MutableLiveData<Pet>()
    val petLiveData: LiveData<Pet> = _petLiveData

    fun getPet(id: String) {
        _petLiveData.value = getPetsData().first { it.id == id }
    }
}
