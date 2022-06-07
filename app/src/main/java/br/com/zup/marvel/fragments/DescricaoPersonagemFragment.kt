package br.com.zup.marvel.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import br.com.zup.marvel.R
import br.com.zup.marvel.databinding.FragmentDescricaoPersonagemBinding

class DescricaoPersonagemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDescricaoPersonagemBinding>(
            inflater,
            R.layout.fragment_descricao_personagem,container,false
        )

        // Inflate the layout for this fragment
        return binding.root
    }
}