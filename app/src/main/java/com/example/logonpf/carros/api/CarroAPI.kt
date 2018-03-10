package com.example.logonpf.carros.api

import com.example.logonpf.carros.model.Carro
import retrofit2.Call
import retrofit2.http.GET

interface CarroAPI{

    @GET("/carro")
    fun buscarTodos() : Call<List<Carro>>

}