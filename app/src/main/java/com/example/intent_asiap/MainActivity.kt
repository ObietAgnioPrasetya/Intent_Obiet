package com.example.intent_asiap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cek.setOnClickListener(){
            intent = Intent(this, Mainmain::class.java)
            intent.putExtra("nim", nim_obiet.text)
            intent.putExtra("nama", nama_obiet.text)
            intent.putExtra("nilai", nilai_obiet.text)
            if (nilai_obiet.text.toString().toInt()>=80) {
                intent.putExtra("Keterangan", "A")
            }
            else if (nilai_obiet.text.toString().toInt()>=60) {
                intent.putExtra("Keterangan", "B")
            }
            else if (nilai_obiet.text.toString().toInt()>=40) {
                intent.putExtra("Keterangan", "C")
            }
            else if (nilai_obiet.text.toString().toInt()>=20) {
                intent.putExtra("Keterangan", "D")
            }
            else if (nilai_obiet.text.toString().toInt()>=0) {
                intent.putExtra("Keterangan", "E")
            }
            startActivity(intent)}
    }
}
