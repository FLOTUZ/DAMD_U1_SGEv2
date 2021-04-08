package com.example.damd_u1_sgev2.Models

data class Grupo(
    val letra: String? = null,
    val profesor: Profesor? = null,
    val materia: Materia? = null,
    val alumnos: ArrayList<Alumno>? = null
)