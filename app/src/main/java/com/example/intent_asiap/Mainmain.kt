package com.example.intent_asiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mainmain.*

class Mainmain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmain)

        val bundle = intent.extras
        val nim27 = bundle?.get("nim")
        val nama27 = bundle?.get("nama")
        val nilai27 = bundle?.get("nilai")
        val keterangan27 = bundle?.get("Keterangan")
        nimku.text=nim27.toString()
        namaku.text=nama27.toString()
        nilaiku.text=nilai27.toString()
        keteranganku.text=keterangan27.toString()
    }
}