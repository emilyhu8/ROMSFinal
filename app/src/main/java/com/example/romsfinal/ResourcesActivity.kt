package com.example.romsfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResourcesActivity : BaseActivity() {
    private lateinit var link1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resources)
        link1=findViewById(R.id.link1)
    }
}