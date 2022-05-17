package com.example.romsfinal

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class EditTownActivity : BaseActivity() {
    private lateinit var topFood: TextView
    private lateinit var name:TextView
    private lateinit var topAttraction: TextView
    private lateinit var category: TextView
    private lateinit var photo:ImageView
    var photos= mutableListOf(R.drawable.subicbay, R.drawable.church, R.drawable.heritage,R.drawable.island, R.drawable.city)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_town)
        topFood=findViewById(R.id.topFood)
        topAttraction=findViewById(R.id.topAttraction)
        name=findViewById(R.id.title)
        category=findViewById(R.id.category)
        photo=findViewById(R.id.photo)

        val position = intent.extras!!.getInt("position")
        val inputName = intent.getStringExtra("name").toString()
        val inputTopAttraction = intent.getStringExtra("topAttraction").toString()
        val inputTopFood = intent.getStringExtra("topFood").toString()
        val inputCategory = intent.getStringExtra("category").toString()

        name.text = inputName
        topAttraction.text = "Top atttraction: "+inputTopAttraction
        topFood.text = "Top Food: "+inputTopFood
        category.text = inputCategory
        photo.setImageResource(photos[position%photos.size])


    }
}