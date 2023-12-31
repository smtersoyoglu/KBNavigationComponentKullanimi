package com.sametersoyoglu.kbnavigationcomponentkullanimi.Odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.sametersoyoglu.kbnavigationcomponentkullanimi.R
import com.sametersoyoglu.kbnavigationcomponentkullanimi.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater,container,false)

        //  ---- Gönderilen verileri alma ----
        val bundle:DetayFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas= bundle.yas
        val gelenBoy= bundle.boy
        val gelenBekar= bundle.bekar

        val urunId = bundle.urun.id
        val urunAd = bundle.urun.ad

        binding.textViewBilgi.text = "$gelenAd $gelenYas - $gelenBoy - $gelenBekar - $urunId - $urunAd"

        val backPress = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textViewBilgi,"Geri dönmek istiyor musunuz?",Snackbar.LENGTH_SHORT)
                    .setAction("EVET") {
                        isEnabled = false // Geri dönüş aktif
                        requireActivity().onBackPressedDispatcher.onBackPressed() // Geri dönüş kodlaması
                    }.show()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)

        binding.buttonGitB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_detayFragment_to_sayfaBFragment)
        }

        return binding.root
    }

}