package com.susanah.mywudhu.utils

import com.susanah.mywudhu.R
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
                "5xPZ8b0MMss",
                R.drawable.tangan
            )
        )

   wudhu.add(
            WudhuModel(
                "3.Berkumur sebanyak tiga kali sambil membersihkan gigi dan mulut dari sisa-sisa makanan.",
                "f5GysZJz6wE",
                R.drawable.kumur
            )
        )

   wudhu.add(
            WudhuModel(
                "4. Membersihkan lubang hidung tiga kali untuk membersihkan kotoran.",
                "ugIbuqc5cTo",
                R.drawable.hidung
            )
        )

   wudhu.add(
            WudhuModel(
                "5. Membilas wajah tiga kali, mulai dari dahi sampai dengan dagu, serta hingga ke garis tepi dekat rambut.",
                "oC7RFUuODQQ",
                R.drawable.wajah
            )
        )

   wudhu.add(
            WudhuModel(
                "6. Mencuci kedua tangan hingga siku sebanyak tiga kali, dimulai dari tangan kanan.",
                "v8XwT88t-kA",
                R.drawable.lengan
            )
        )

   wudhu.add(
            WudhuModel(
                "8. Mengusap kepala sebanyak tiga kali.",
                "9KeOV3TIDbk",
                R.drawable.kepala
            )
        )

   wudhu.add(
       WudhuModel(
           "9. Selesai mengusap kepala, dilanjutkan mengusap dua telinga sebanyak tiga kali.",
           "N08roeZ0ypk",
           R.drawable.telinga
       )
   )

        wudhu.add(
            WudhuModel(
                "10. Membasuh kedua kaki sampai di atas mata kaki sebanyak tiga kali, dimulai dari kaki kanan terlebih dahulu.\n"+
                "Lafal Arab-Latin: Asyhadu allâ ilâha illallâhu wahdahû lâ syarîka lahu wa asyhadu anna muhammadan 'abduhû wa rasûluhû, allâhummaj'alnî minat tawwâbîna waj'alnii minal mutathahhirîna.\n" +
                        "\n" +
                        "Artinya: \"Aku bersaksi bahwa tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya," +
                        " dan aku bersaksi bahwa Nabi Muhammad adalah hamba dan utusan Allah. Ya Allah," +
                        " jadikanlah aku termasuk dalam golongan orang-orang yang bertobat dan jadikanlah aku " +
                        "termasuk dalam golongan orang-orang yang bersuci (shalih).\"\n",
                "9fQWCnRO1E0",
                R.drawable.kaki
            )
        )




        return wudhu
    }
}