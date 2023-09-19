package com.sametersoyoglu.kbnavigationcomponentkullanimi

import java.io.Serializable

// veri transferini gerçekleştirebilmek için navigation compenent de : Serializable kullanmamız lazım.
data class Urunler(var id:Int, var ad:String) : Serializable
