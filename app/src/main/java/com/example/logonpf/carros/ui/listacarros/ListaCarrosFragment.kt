package com.example.logonpf.carros.ui.listacarros


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.logonpf.carros.R


/**
 * A simple [Fragment] subclass.
 */
class ListaCarrosFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_lista_carros, container, false)
    }

}// Required empty public constructor
