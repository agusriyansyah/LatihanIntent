package com.example.tugasintent

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nim_1: EditText = findViewById(R.id.nim)
        var nama_1: EditText = findViewById(R.id.nama)
        var nilai_1: EditText = findViewById(R.id.nilai)


        btn_proses.setOnClickListener{

            intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("nim",nim_1.getText())
            intent.putExtra("nama",nama_1.getText())
            intent.putExtra("nilai",nilai_1.getText())

            startActivity(intent)
        }

    }
}