package com.empresa.componentes.menu.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.empresa.componentes.R

class InicioFragment : Fragment() {

    lateinit var btnAbrirNoticias : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        var view = inflater.inflate(R.layout.fragment_inicio, container, false)

        btnAbrirNoticias = view.findViewById(R.id.btnAbrirNoticias)
        btnAbrirNoticias.setOnClickListener {

            findNavController().navigate(R.id.noticiasFragment)

        }

        return  view
    }


}