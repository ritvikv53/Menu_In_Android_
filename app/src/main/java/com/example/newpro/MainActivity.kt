package com.example.newpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var selectedOption = ""

        when(item?.itemId) {


            R.id.about_us -> selectedOption = "ABOUT US"
            R.id.help -> selectedOption = "HELP"
            R.id.item1 -> selectedOption = "Item1"
            R.id.item2 -> selectedOption = "Item2"
        }
            Toast.makeText(this,"Option : " + selectedOption,Toast.LENGTH_SHORT).show()

            return super.onOptionsItemSelected(item)

        }







}


