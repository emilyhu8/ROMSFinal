package com.example.romsfinal

class Repository private constructor(){
    companion object{
         var names=listOf("Subic Bay", "Cavite", "Silay City", "Siquijor", "Baguio City")
         var topAttraction=listOf("Pamulaklakin Forest Trail", "San Roque Parish Church", "Hofilena Heritage House", "Siquijor Butterfly Sanctuary", "Burnham Park")
        var topFood=listOf("Xtremely Xpresso Cafe", "Vakante Food Hub", "PUNONG Gary's Place", "D'Barkads Food Haus", "Chef's Home Baguio City")
         var category=listOf("Children Friendly!", "Historical", "Historical", "Children Friendly", "Children Friendly")
        var places = mutableListOf<Towns>()

    }


}