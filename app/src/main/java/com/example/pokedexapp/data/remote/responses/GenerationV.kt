package com.example.pokedexapp.data.remote.responses


import com.example.pokedexapp.data.remote.responses.BlackWhite
import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)