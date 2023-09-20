package com.sametersoyoglu.kbnavigationcomponentkullanimi.Odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sametersoyoglu.kbnavigationcomponentkullanimi.R
import com.sametersoyoglu.kbnavigationcomponentkullanimi.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {

    private lateinit var binding : FragmentSayfaXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonXGitY.setOnClickListener {

            // her iki kodlada geçiş yapabiliriz.

            val action = SayfaXFragmentDirections.actionSayfaXFragmentToSayfaYFragment()
            Navigation.findNavController(it).navigate(action)

            //Navigation.findNavController(it).navigate(R.id.action_sayfaXFragment_to_sayfaYFragment)
        }

    }
}