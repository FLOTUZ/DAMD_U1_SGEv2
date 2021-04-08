package com.example.damd_u1_sgev2.Models

class Alumno(
    nc: Int? = null,
    nombre: String? = null,
    apellidos: String? = null,
    val materia: ArrayList<Materia>? = null,
) : Persona(nc, nombre, apellidos)
