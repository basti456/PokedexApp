package com.example.pokedexapp.data.remote.responses


import com.example.pokedexapp.data.remote.responses.Emerald
import com.example.pokedexapp.data.remote.responses.FireredLeafgreen
import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire
)