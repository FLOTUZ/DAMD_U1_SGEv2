package com.example.damd_u1_sgev2.Models

class Profesor(
    nc: Int? = null,
    nombre: String? = null,
    apellidos: String? = null,
    val grupos: ArrayList<Grupo>? = null
) : Persona(nc, nombre, apellidos)
