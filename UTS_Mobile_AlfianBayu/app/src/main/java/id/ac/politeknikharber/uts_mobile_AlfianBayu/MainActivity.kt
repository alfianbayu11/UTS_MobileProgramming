package id.ac.politeknikharber.uts_mobile_AlfianBayu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.ac.politeknikharber.uts_mobile_AlfianBayu.about.TentangUTS
import id.ac.politeknikharber.uts_mobile_AlfianBayu.calculator.Calculator
import id.ac.politeknikharber.uts_mobile_AlfianBayu.menu.AdapterMenuApp
import id.ac.politeknikharber.uts_mobile_AlfianBayu.menu.IsiMenuApp
import id.ac.politeknikharber.uts_mobile_AlfianBayu.menu.MenuApp
import id.ac.politeknikharber.uts_mobile_AlfianBayu.pendidikan.Pendidikan

class MainActivity : AppCompatActivity() {

    private lateinit var rv :RecyclerView
    private lateinit var viewManger:RecyclerView.LayoutManager
    private lateinit var viewAdapter:RecyclerView.Adapter<*>
    val isi:ArrayList<MenuApp> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv_menu)
        isi.addAll(IsiMenuApp.data)
        viewManger = GridLayoutManager(this, 2)
        viewAdapter = AdapterMenuApp(isi)

        rv.apply {
            layoutManager = viewManger
            adapter = viewAdapter

            (viewAdapter as AdapterMenuApp).setOnItemClickCallback(object:AdapterMenuApp.OnItemClickCallback{
                override fun onItemClicked(menuApp: MenuApp) {
                    pindahHalaman(menuApp)
                }
            })
        }
    }

    private fun pindahHalaman(menuApp: MenuApp){
        when(menuApp.nama){
            "Pendidikan" ->{
                val intent = Intent(this, Pendidikan::class.java)
                startActivity(intent)
            }
            "Calculator"->{
                val intent = Intent(this, Calculator::class.java)
                startActivity(intent)
            }
            "information" -> {
                val intent = Intent(this, TentangUTS::class.java)
                startActivity(intent)
            }
            "Close" -> finish()
        }
    }
}