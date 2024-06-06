package com.example.pokedexapp.data.remote.responses


import com.example.pokedexapp.data.remote.responses.Icons
import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: Icons,
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoon
)