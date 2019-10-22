package com.example.tugasintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activitykedua.*


class ActivityKedua : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitykedua)

        val bundle= intent.extras
        val nim_2 = bundle?.get("nim")
        val nama_2 = bundle?.get("nama")
        val nilai_2 = bundle?.get("nilai")
        var nilai = nilai_2.toString()
        var nilai_ket = nilai.toInt()

        if (nilai_ket >= 80){
            keterangan.setText("Keterangan : A")
        }
        else if(nilai_ket >= 60){
            keterangan.setText("Keterangan : B")
        }
        else if(nilai_ket >= 40){
            keterangan.setText("Keterangan : C")
        }
        else if(nilai_ket >= 20){
            keterangan.setText("Keterangan : D")
        }
        else{
            keterangan.setText("Keterangan : E")
        }
        id_nim.setText("Nim :"+nim_2)
        id_nama.setText("Nama :"+nama_2)
        id_nilai.setText("Nilai :"+nilai_2)

    }

}