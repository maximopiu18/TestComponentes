package com.empresa.componentes.menu
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.empresa.componentes.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView


class MenuActivity: AppCompatActivity() {
    lateinit var navController :NavController
    lateinit var bottomNavigationView :BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)

        var navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        bottomNavigationView = findViewById(R.id.myMenu)
        setupBottomMenu()

    }

    private fun setupBottomMenu() {

        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    openFragment(1)
                    return@OnItemSelectedListener true
                }
                R.id.menu_noticias -> {
                    openFragment(2)
                    return@OnItemSelectedListener true
                }
                R.id.menu_ajustes -> {
                    openFragment(3)
                    return@OnItemSelectedListener true
                }

            }
            false
        })
    }

    private fun openFragment(opcion: Int){


        when (opcion) {
            1 -> {
                navController.navigate(R.id.inicioFragment)
            }

            2 -> {
                navController.navigate(R.id.noticiasFragment)

            }
            3 -> {
                navController.navigate(R.id.ajustesFragment)
            }
        }
    }


}