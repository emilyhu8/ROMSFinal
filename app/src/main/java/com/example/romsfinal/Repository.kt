package com.example.romsfinal

class Repository private constructor(){
    companion object{
         var names=listOf("Subic Bay", "Cavite", "Silay City")
         var topAttraction=listOf("Pamulaklakin Forest Trail", "San Roque Parish Church", "Hofilena Heritage House")
        var topFood=listOf("Xtremely Xpresso Cafe", "Vakante Food Hub", "PUNONG Gary's Place")
         var category=listOf("Children Friendly!", "Historical", "Historical")
        var places = mutableListOf<Towns>()

    }


}