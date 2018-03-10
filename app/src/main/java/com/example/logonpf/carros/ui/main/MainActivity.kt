package com.example.logonpf.carros.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.logonpf.carros.R
import com.example.logonpf.carros.ui.listacarros.ListaCarrosFragment
import com.example.logonpf.carros.ui.novocarro.NovoCarroFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_lista -> {
                changeFragment(ListaCarrosFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_novo -> {
                changeFragment(NovoCarroFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_sobre -> {
                Toast.makeText(this, "Em construção",
                        Toast.LENGTH_LONG).show()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    fun changeFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.containerFragment, fragment)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
