package com.example.damd_u1_sgev2.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.damd_u1_sgev2.MateriaActivity
import com.example.damd_u1_sgev2.Models.Curso
import com.example.damd_u1_sgev2.R

class CursosLVAdapter (val context: Context, val layout: Int, val lista: ArrayList<Curso>): BaseAdapter() {
    override fun getCount(): Int {
        return lista.size
    }

    override fun getItem(position: Int): Any {
        return lista[position]
    }

    override fun getItemId(position: Int): Long {
        return -1
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val miView = inflater.inflate(layout, null)

        val codigoMateria = miView.findViewById<TextView>(R.id.lbl_codigoMateria)
        val nombreMateria = miView.findViewById<TextView>(R.id.lbl_nombreMateria)
        val cardviewCurso = miView.findViewById<CardView>(R.id.cardView_curso)

        codigoMateria.text = lista[position].codigo
        nombreMateria.text = lista[position].nombreMateria

        cardviewCurso.setOnClickListener {

            val idMateria = lista[position].codigo

            val intent = Intent(context, MateriaActivity::class.java)
            intent.putExtra("ID_MATERIA", idMateria)
            context.startActivity(intent)
        }

        return miView
    }
}