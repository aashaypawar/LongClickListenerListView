package com.aashay.longclicklistenerlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCity = arrayOf("Delhi", "Mumbai", "Hyderabad", "Pune", "Bengaluru", "Chennai", "Kolkata", "Jaipur", "Lucknow", "Bhopal")

        val mListView: ListView = findViewById(R.id.listView)

        val mAdapter: ArrayAdapter<*> = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, mCity)
        mListView.adapter = mAdapter

        mListView.onItemLongClickListener = AdapterView.OnItemLongClickListener { _, _, index, _ ->
            Toast.makeText(applicationContext, "Long clicked on ${mCity[index]}", Toast.LENGTH_SHORT).show()
            true
        }
    }
}