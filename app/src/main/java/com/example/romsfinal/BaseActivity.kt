package com.example.romsfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity(){
    private lateinit var History: Button
    private lateinit var Towns: Button
    private lateinit var Resources: Button
    private lateinit var Home: ImageButton

    override fun onResume() {
        super.onResume()
        History=findViewById(R.id.History)
        Towns=findViewById(R.id.Towns)
        Resources=findViewById(R.id.Resources)
        Home=findViewById(R.id.Home)

        Home.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent);
        }
        History.setOnClickListener(){
            val intent= Intent(this, HistoryActivity::class.java)
            startActivity(intent);
        }
        Towns.setOnClickListener(){
            val intent= Intent(this, TownsActivity::class.java)
            startActivity(intent);
        }
        Resources.setOnClickListener(){
            val intent= Intent(this, ResourcesActivity::class.java)
            startActivity(intent);
        }
    }

}