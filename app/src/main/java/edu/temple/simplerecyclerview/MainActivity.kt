package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = IntArray(20) { i -> (i + 1) * 5 }
        // TODO Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //TODO Step 2: Provide a LayoutManager
        recyclerView.layoutManager = GridLayoutManager(this, 4)

        //TODO Step 4: Provide a RecyclerView.Adapter
        recyclerView.adapter = NumberDisplayAdapter(numbers)
    }
}