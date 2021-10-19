package com.example.dzikirapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HarianDzikirDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_harian_dzikir_doa2)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}