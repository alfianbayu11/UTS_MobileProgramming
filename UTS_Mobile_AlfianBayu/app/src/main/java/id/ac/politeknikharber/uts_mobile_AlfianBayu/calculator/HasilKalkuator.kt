package id.ac.politeknikharber.uts_mobile_AlfianBayu.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.politeknikharber.uts_mobile_AlfianBayu.R
import kotlinx.android.synthetic.main.activity_hasil_kalkuator.*

class HasilKalkuator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_kalkuator)

        val hasil = intent.getStringExtra("hasil")
        tv_hasil_calculator.text = hasil
    }
}