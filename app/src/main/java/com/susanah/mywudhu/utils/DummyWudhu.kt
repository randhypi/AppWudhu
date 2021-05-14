package com.susanah.mywudhu.utils

import com.susanah.mywudhu.data.model.WudhuModel

object DummyWudhu {

    fun getWudhu(): List<WudhuModel> {
        val wudhu = ArrayList<WudhuModel>()

//        1
        wudhu.add(
            WudhuModel(
               "1. Membaca niat wudhu \n " +
                       "\n\"Nawaitul wudhuu'a li raf'll hadatsil ashghari fardhal lilaahi ta'aalaa.\" \n " +
                       " \nArtinya: \"Saya niat berwudhu untuk menghilangkan hadas kecil, fardhu karena Allah.\"",
            null
            )
        )

        wudhu.add(
            WudhuModel(
                "2. Membasuh tangan serta menggosok sela-sela jari hingga bersih sebanyak tiga kali",
                "5xPZ8b0MMss"

            )
        )

   wudhu.add(
            WudhuModel(
                "3.Berkumur sebanyak tiga kali sambil membersihkan gigi dan mulut dari sisa-sisa makanan.",
                "f5GysZJz6wE"
            )
        )

   wudhu.add(
            WudhuModel(
                "4. Membersihkan lubang hidung tiga kali untuk membersihkan kotoran.",
                "ugIbuqc5cTo"
            )
        )

   wudhu.add(
            WudhuModel(
                "5. Membilas wajah tiga kali, mulai dari dahi sampai dengan dagu, serta hingga ke garis tepi dekat rambut.",
                "oC7RFUuODQQ"
            )
        )

   wudhu.add(
            WudhuModel(
                "6. Mencuci kedua tangan hingga siku sebanyak tiga kali, dimulai dari tangan kanan.",
                "v8XwT88t-kA"
            )
        )

   wudhu.add(
            WudhuModel(
                "8. Mengusap kepala sebanyak tiga kali.",
                "9KeOV3TIDbk"
            )
        )

   wudhu.add(
       WudhuModel(
           "9. Selesai mengusap kepala, dilanjutkan mengusap dua telinga sebanyak tiga kali.",
           "N08roeZ0ypk"
       )
   )

        wudhu.add(
            WudhuModel(
                "10. Membasuh kedua kaki sampai di atas mata kaki sebanyak tiga kali, dimulai dari kaki kanan terlebih dahulu.",
                "9fQWCnRO1E0"
            )
        )




        return wudhu
    }
}