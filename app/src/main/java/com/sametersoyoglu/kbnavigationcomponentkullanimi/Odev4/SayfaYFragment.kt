package com.sametersoyoglu.kbnavigationcomponentkullanimi.Odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.sametersoyoglu.kbnavigationcomponentkullanimi.R
import com.sametersoyoglu.kbnavigationcomponentkullanimi.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {

    private lateinit var binding : FragmentSayfaYBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sayfa Y den Anasayfaya dönme geri tuşu ile
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // İstediğin sayfaya dönme geri tuşu ile Sayfa Y den Anasayfaya
                val action = SayfaYFragmentDirections.actionSayfaYFragmentToAnasayfaFragment2()
                findNavController().navigate(action)
            }
        })

    }

}