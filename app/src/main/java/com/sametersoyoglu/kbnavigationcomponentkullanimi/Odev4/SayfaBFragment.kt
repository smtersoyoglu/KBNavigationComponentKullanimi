package com.sametersoyoglu.kbnavigationcomponentkullanimi.Odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sametersoyoglu.kbnavigationcomponentkullanimi.R
import com.sametersoyoglu.kbnavigationcomponentkullanimi.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {

    private lateinit var binding : FragmentSayfaBBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaBBinding.inflate(inflater,container,false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGitY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaBFragment_to_sayfaYFragment)
        }
    }

}