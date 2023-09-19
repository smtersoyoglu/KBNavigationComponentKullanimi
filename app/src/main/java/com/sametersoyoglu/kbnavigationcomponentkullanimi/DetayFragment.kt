package com.sametersoyoglu.kbnavigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
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

        return binding.root
    }

}