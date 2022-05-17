package com.example.romsfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TownsActivity : BaseActivity() {
    /**
    private var names=listOf("Manilla")
    private var topAttraction=listOf("")
    private var topFood=listOf("")
    private var category=listOf("")
    */
    private lateinit var recyclerView: RecyclerView

    private var townsAdapter=TownsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_towns)

        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)

        for (i in Repository.names.indices)
            Repository.places.add(Towns(Repository.names[i], Repository.topAttraction[i], Repository.topFood[i], Repository.category[i]))

        recyclerView.adapter=townsAdapter
        recyclerView.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val decorator = DividerItemDecoration(applicationContext, LinearLayoutManager.VERTICAL)
        recyclerView.addItemDecoration(decorator)

    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        this.intent = intent
    }
    override fun onResume() {
        super.onResume()

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}