package com.sametersoyoglu.kbnavigationcomponentkullanimi.Odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sametersoyoglu.kbnavigationcomponentkullanimi.R
import com.sametersoyoglu.kbnavigationcomponentkullanimi.Urunler
import com.sametersoyoglu.kbnavigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener {
            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Nasılsın"

            // Fragmentlar arası veri gönderme
            val urun = Urunler(100,"TV")
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToDetayFragment(urun = urun, ad ="Ahmet", yas = 23, boy = 1.78f,bekar = true)
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.buttonGitA.setOnClickListener {
            val urun = Urunler(100,"TV")
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToDetayFragment(urun = urun, ad ="Ahmet", yas = 23, boy = 1.78f,bekar = true)
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.buttonGitX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)
        }

        binding.buttonGoster.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomSheetGecis)

        }


        return binding.root
        
    }
}