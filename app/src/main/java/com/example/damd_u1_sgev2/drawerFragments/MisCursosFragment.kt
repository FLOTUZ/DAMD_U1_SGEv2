package com.example.damd_u1_sgev2.drawerFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.damd_u1_sgev2.Models.Curso
import com.example.damd_u1_sgev2.R
import com.example.damd_u1_sgev2.adapters.CursosLVAdapter
import com.example.damd_u1_sgev2.databinding.FragmentMisCursosBinding


class MisCursosFragment : Fragment() {

    private var _binding: FragmentMisCursosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMisCursosBinding.inflate(inflater, container, false)
        val view = binding.root

        val lvCursos= binding.lvCursos

        val cursos = ArrayList<Curso>()
        cursos.add(Curso("B7T1" , "Redes Emergentes"))
        cursos.add(Curso("B7T2" , "Desarrollo De Aplicaciones Para Dispositivos Moviles"))
        cursos.add(Curso("B7T3" , "Taller De Investigacion I"))
        cursos.add(Curso("B7T4" , "Sistemas Operativos II"))
        cursos.add(Curso("B7T5" , "Negocios Electronicos I"))
        cursos.add(Curso("B7T9" , "Ciclos De Vida De Software Seguro"))

        lvCursos.adapter = CursosLVAdapter(container!!.context, R.layout.cursos_card, cursos)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}