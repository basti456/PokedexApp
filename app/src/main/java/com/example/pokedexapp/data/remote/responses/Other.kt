package com.example.pokedexapp.data.remote.responses


import com.example.pokedexapp.data.remote.responses.DreamWorld
import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)