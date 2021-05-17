package com.susanah.mywudhu.utils

import android.graphics.drawable.Drawable
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.SholatModel

object DummySholat {

    fun getSholat(): List<SholatModel> {
        val sholat = ArrayList<SholatModel>()

//        1
        sholat.add(
            SholatModel(
                "iRe7acaMn5g",
                "1. Sholat ini bisa diawali dengan niat sebelum melakukan takbiratul ihram\n" +
                        "2. Gerakan kedua setelah niat adalah melakukan takbiratul ihram.\n " +
                        "Takbiratul Ihram untuk laki-laki dilakukan sejajar dengan daun telinga." +
                        " Sedangkan takbiratul ihram untuk kaum wanita bisa dilakukan sejajar dengan dada.\n\n" +
                        "3. Membaca Do'a Iftitah \n " +
                        "   Arab : \n" +
                        "اللهُ اَكْبَرُ كَبِرًا وَالْحَمْدُ لِلهِ كَشِيْرًا وَسُبْحَانَ اللهِ بُكْرَةً وَاَصِيْلًا " +
                        ". اِنِّى وَجَّهْتُ وَجْهِيَ لِلَّذِيْ فَطَرَالسَّمَاوَاتِ وَالْااَرْضَ حَنِيْفًا مُسْلِمًا وَمَا اَنَا مِنَ الْمُشْرِكِيْنَ" +
                        " . اِنَّ صَلَاتِيْ وَنُسُكِيْ وَمَحْيَايَ وَمَمَاتِيْ لِلهِ رَبِّ الْعَا لَمِيْن" +
                        "َ . لاَ شَرِيْكَ لَهُ وَبِذَ لِكَ اُمِرْتُ وَاَنَ مِنَ الْمُسْلِمِيْنَ .\n" +
                        "   Latin : \n" +
                        "   Allaahu akbaru kabiiraw walhamdu lilaahi katsiran, " +
                        "wa subhaanallaahi bukrataw wa’ashiila, innii wajjahtu" +
                        "wajhiya lilladzii fatharas samaawaati wal ardha haniifam" +
                        "muslimaw wamaa anaa minal musyrikiina. Inna shalaatii wa nusukii " +
                        "wa mahyaaya wa mamaatii lillaahi Rabbil ‘aalamiina. Laa syariikalahu" +
                        " wa bidzaalika umirtu wa anaa minal muslimiina. \n" +
                        "   Artinya : \n" +
                        "    Allah maha besar dengan sebesar besarnya. Segala puji yang sebanyak banyaknya bagi Allah." +
                        " Maha Suci Allah pada pagi dan petang hari. Aku menghadapkan wajahku kepada Tuhan yang telah " +
                        "menciptakan langit dan bumi dengan segenap kepatuhan dan kepasrahan diri, dan aku bukanlah " +
                        "termasuk orang orang yang menyekutukanNya.\n" +
                        "\n" +
                        "   Sesungguhnya shalatku, ibadahku, hidup dan matiku hanyalah kepunyaan Allah, Tuhan semesta alam," +
                        " yang tiada satu pun sekutu bagiNya. Dengan semua itulah aku diperintahkan dan aku adalah termasuk " +
                        "orang orang yang berserah diri. (Muslim)\n\n" +
                        "4. Membaca Al-fatihah :\n" +
                        "  بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ - ١\n" +
                        " bismillāhir-raḥmānir-raḥīm\n " +
                        "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِيْنَۙ - ٢\n" +
                        " al-ḥamdu lillāhi rabbil-'ālamīn\n" +
                        " الرَّحْمٰنِ الرَّحِيْمِۙ - ٣\n" +
                        "ar-raḥmānir-raḥīm\n" +
                        " مٰلِكِ يَوْمِ الدِّيْنِۗ  \n" +
                        " māliki yaumid-dīn \n" +
                        "اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَعِيْنُۗ ٥  \n" +
                        "  iyyāka na'budu wa iyyāka nasta'īn\n " +
                        "اِهْدِنَا الصِّرَاطَ الْمُسْتَقِيْمَ ۙ ٦ \n" +
                        "ihdinaṣ-ṣirāṭal-mustaqīm\n" +
                        " صِرَاطَ الَّذِيْنَ اَنْعَمْتَ عَلَيْهِمْ ەۙ غَيْرِ الْمَغْضُوْبِ عَلَيْهِمْ وَلَا الضَّاۤلِّيْنَ -  ٧\n" +
                        " ṣirāṭallażīna an'amta 'alaihim gairil-magḍụbi 'alaihim wa laḍ-ḍāllīn\n\n" +
                        "   Artinya : \nDengan nama Allah Yang Maha Pengasih, Maha Penyayang. Segala puji bagi Allah, " +
                        "Tuhan seluruh alam, Yang Maha Pengasih, Maha Penyayang, Pemilik hari pembalasan." +
                        " Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami mohon pertolongan. " +
                        "Tunjukilah kami jalan yang lurus, (yaitu) jalan orang-orang yang telah Engkau beri nikmat " +
                        "kepadanya; bukan (jalan) mereka yang dimurkai, dan bukan (pula jalan) mereka yang sesat.\n" +
                        "5. Membaca Surat Pendek   :\n" +
                        "بِسْمِ اللّٰهِ الرَّحْمٰنِ \n" +
                        "الرَّحِيْمِ قُلْ هُوَ اللّٰهُ اَحَدٌۚ \n" +
                        "qul huwallāhu aḥad\n" +
                        " اَللّٰهُ الصَّمَدُۚ \n" +
                        "allāhuṣ-ṣamad \n" +
                        "لَمْ يَلِدْ وَلَمْ يُوْلَدْۙ\n" +
                        " lam yalid wa lam yụlad \n" +
                        "وَلَمْ يَكُنْ لَّهٗ كُفُوًا اَحَدٌ\n" +
                        " wa lam yakul lahụ kufuwan aḥad\n" +
                        "\n",
                R.drawable.berdiri,
                "ghgVQbp6okU",
                "6. Rukuk  :\n" +
                        "Membaca Do'a :\n" +
                        "3x سُبْحَانَ رَبِّيَ الْعَظِيْمِ وَبِحَمْدِهِ\n" +
                        "Subhaana Rabbiyal ‘Adziimi Wa Bihamdih. (Dibaca 3x)\n\n" +
                        "Artinya, “Maha Suci Tuhan yang Maha Agung serta memujilah aku kepada-Nya.”",
                R.drawable.rukuk,
                "2fe5xz4zw9w",
                "7. I'Tidal    :" +
                        "Didalam Sholat Setelah selesai Ruku’, kemudian kita I’tidal, yaitu bangkit dari ruku’ sembari mengangkat kedua tangan sejajar telinga, seraya membaca :\n" +
                        "\n" +
                        "سَمِعَ اللهُ لِمَنْ حَمِدَهُ\n" +
                        "Sami’alloohu Liman Hamidah\n" +
                        "\n" +
                        "Pada waktu berdiri tegak (I’tidal) seraya membaca :\n" +
                        "\n" +
                        "رَبَّنَا لَكَ الْحَمْدُ مِلْءُ السَّموَاتِ وَمِلْءُ اْلاَرْضِ وَمِلْءُمَاشِئْتَ مِنْ شَيْئٍ بَعْدُ\n" +
                        "Rabbanaa Lakal Hamdu Milus Samaawati Wa Milul Ardhi Wa Mil Umaasyi’ta Min Syaiin Ba’du.\n" +
                        "\n" +
                        "Artinya: Wahai Tuhan Kami ! Hanya Untuk-Mu lah Segala Puji, Sepenuh Langit Dan Bumi Dan Sepenuh Barang Yang Kau Kehendaki Sesudahnya.",
                R.drawable.iktidal,
                "XIR1QJNlfHU",
                "8. Sujud pertama\n" +
                        "Kemudian melakukan sujud dengan tuma'ninah dengan membaca bacaan sujud." +
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
                R.drawable.sujud1,
                "wP82iwh5xeE",
                "9. Duduk di antara dua sujud  :\n" +
                        "Membaca Do'a :\n" +
                        "\n" +
                        "رَبِّ اغْفِرْ لِي ، وَارْحَمْنِي ، وَاجْبُرْنِي ، وَارْفَعْنِي ، وَارْزُقْنِي ، وَاهْدِنِي\n" +
                        "Robbighfirlii warhamnii, wajburnii, warfa’nii, warzuqnii, wahdinii\n" +
                        " Artinya: \n“Ya Allah ampunilah aku, rahmatilah aku, perbaikilah keadaanku, tinggikanlah derajatku, berilah rezeki dan petunjuk untukku”",
                R.drawable.dudukdiantara2sujud,
                "arTaGBH_S-s",
                "Melakukan sujud ke-2 dengan tuma'ninah dengan membaca bacaan sujud. \n " +
                        "Setelah selesai sujud ke-2 kemudian berdiri untuk melanjutkan rakaat berikutnya.\n" +
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
                R.drawable.sujud2
            )
        )

// 2
        sholat.add(
            SholatModel(
                "YFFmSKsyl20",
                "Rakaat ke-2    :\n" +
                        "1. Berdiri dan Membaca Al-Fatihah :\n" +
                        "  بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ - ١\n" +
                        " bismillāhir-raḥmānir-raḥīm\n " +
                        "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِيْنَۙ - ٢\n" +
                        " al-ḥamdu lillāhi rabbil-'ālamīn\n" +
                        " الرَّحْمٰنِ الرَّحِيْمِۙ - ٣\n" +
                        "ar-raḥmānir-raḥīm\n" +
                        " مٰلِكِ يَوْمِ الدِّيْنِۗ  \n" +
                        " māliki yaumid-dīn \n" +
                        "اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَعِيْنُۗ ٥  \n" +
                        "  iyyāka na'budu wa iyyāka nasta'īn\n " +
                        "اِهْدِنَا الصِّرَاطَ الْمُسْتَقِيْمَ ۙ ٦ \n" +
                        "ihdinaṣ-ṣirāṭal-mustaqīm\n" +
                        " صِرَاطَ الَّذِيْنَ اَنْعَمْتَ عَلَيْهِمْ ەۙ غَيْرِ الْمَغْضُوْبِ عَلَيْهِمْ وَلَا الضَّاۤلِّيْنَ -  ٧\n" +
                        " ṣirāṭallażīna an'amta 'alaihim gairil-magḍụbi 'alaihim wa laḍ-ḍāllīn\n\n" +
                        "   Artinya : \nDengan nama Allah Yang Maha Pengasih, Maha Penyayang. Segala puji bagi Allah, " +
                        "Tuhan seluruh alam, Yang Maha Pengasih, Maha Penyayang, Pemilik hari pembalasan." +
                        " Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami mohon pertolongan. " +
                        "Tunjukilah kami jalan yang lurus, (yaitu) jalan orang-orang yang telah Engkau beri nikmat " +
                        "kepadanya; bukan (jalan) mereka yang dimurkai, dan bukan (pula jalan) mereka yang sesat.\n" +
                        "2. Membaca Surat Pendek   :\n" +
                        "إِذَا جَآءَ نَصْرُ ٱللَّهِ وَٱلْفَتْحُ\n" +
                        "iżā jā`a naṣrullāhi wal-fat-ḥ\n" +
                        "\n" +
                        "Artinya: \"Apabila telah datang pertolongan Allah dan kemenangan,\"\n" +
                        "\n" +
                        "وَرَأَيْتَ ٱلنَّاسَ يَدْخُلُونَ فِى دِينِ ٱللَّهِ أَفْوَاجًا\n" +
                        "\n" +
                        "wa ra`aitan-nāsa yadkhulụna fī dīnillāhi afwājā\n" +
                        "\n" +
                        "Artinya: \"dan kamu lihat manusia masuk agama Allah dengan berbondong-bondong,\"\n" +
                        "\n" +
                        "فَسَبِّحْ بِحَمْدِ رَبِّكَ وَٱسْتَغْفِرْهُ ۚ إِنَّهُۥ كَانَ تَوَّابًۢا\n" +
                        "\n" +
                        "fa sabbiḥ biḥamdi rabbika wastagfir-h, innahụ kāna tawwābā\n" +
                        "\n" +
                        "Artinya: \"maka bertasbihlah dengan memuji Tuhanmu dan mohonlah ampun kepada-Nya. Sesungguhnya Dia adalah Maha Penerima taubat.\"",
                R.drawable.takbir,
                "ghgVQbp6okU",
                "2. Rukuk  :\n" +
                        "Membaca Do'a :\n" +
                        "3x سُبْحَانَ رَبِّيَ الْعَظِيْمِ وَبِحَمْدِهِ\n" +
                        "Subhaana Rabbiyal ‘Adziimi Wa Bihamdih. (Dibaca 3x)\n" +
                        "Artinya, “Maha Suci Tuhan yang Maha Agung serta memujilah aku kepada-Nya.”",
                R.drawable.rukuk,
                "2fe5xz4zw9w",
                "3. Melakukan iktidal dengan tuma'ninah diiringi dengan membaca bacaan iktidal.    :" +
                       "\n" +
                        "سَمِعَ اللهُ لِمَنْ حَمِدَهُ\n" +
                        "Sami’alloohu Liman Hamidah\n" +
                        "\n" +
                        "Pada waktu berdiri tegak (I’tidal) seraya membaca :\n" +
                        "\n" +
                        "رَبَّنَا لَكَ الْحَمْدُ مِلْءُ السَّموَاتِ وَمِلْءُ اْلاَرْضِ وَمِلْءُمَاشِئْتَ مِنْ شَيْئٍ بَعْدُ\n" +
                        "Rabbanaa Lakal Hamdu Milus Samaawati Wa Milul Ardhi Wa Mil Umaasyi’ta Min Syaiin Ba’du.\n" +
                        "\n" +
                        "Artinya: Wahai Tuhan Kami ! Hanya Untuk-Mu lah Segala Puji, Sepenuh Langit Dan Bumi Dan Sepenuh Barang Yang Kau Kehendaki Sesudahnya.",
                R.drawable.iktidal,
                "XIR1QJNlfHU",
                "4. Sujud pertama\n" +
                        "Kemudian melakukan sujud dengan tuma'ninah dengan membaca bacaan sujud.\n"+
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
                R.drawable.sujud1,
                "wP82iwh5xeE",
                "5.  Duduk diantara 2 sujud\n" +
                        "Melakukan duduk diantara 2 sujud dengan posisi duduk tawaruk. Dilanjutkan dengan membaca bacaan duduk diantara 2 sujud.\n "+
                        "\n" +
                        "رَبِّ اغْفِرْ لِي ، وَارْحَمْنِي ، وَاجْبُرْنِي ، وَارْفَعْنِي ، وَارْزُقْنِي ، وَاهْدِنِي\n" +
                        "Robbighfirlii warhamnii, wajburnii, warfa’nii, warzuqnii, wahdinii\n" +
                        "   Artinya: “Ya Allah ampunilah aku, rahmatilah aku, perbaikilah keadaanku, tinggikanlah derajatku, berilah rezeki dan petunjuk untukku”",
                R.drawable.dudukdiantara2sujud,
                "arTaGBH_S-s",
                "6. Melakukan sujud ke-2 dengan tuma'ninah dengan membaca bacaan sujud." +
                        "\n" +
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
                R.drawable.sujud2,
                "ya5qW6mCl5w",
                "7. Duduk Tasyahud Awal    :\n" +
                        "التَّحِيَّاتُ الْمُبَارَكَاتُ الصَّلَوَاتُ الطَّيِّبَاتُ لِلَّهِ السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِىُّ وَرَحْمَةُ\n اللَّهِ وَبَرَكَاتُهُ السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ\n" +
                        "“At_Tahiyyaatul Mubaarakaatush Shalawaatuth Thoyyibaatulillaah. As_Salaamu’Alaika Ayyuhan Nabiyyu Wa Rahmatullaahi Wabarakaatuh, Assalaamu’Alaina Wa’Alaa Ibaadillaahishaalihiin.”\n" +
                        "\n" +
                        "Artinya: Segala kehormatan, dan keberkahan, kebahagiaan dan kebaikan itu punya Allah. Keselamatan atas Nabi Muhammad, juga rahmat dan berkahnya. Keselamatan dicurahkan kepada kami dan atas seluruh hamba Allah yang sholeh.",
                R.drawable.tahiyatawal
            )
        )

//        3

        sholat.add(
            SholatModel(
                "64dgIaRCfMI",
                "Rakaat ke-3    :\n" +
                        "1. Berdiri dan Membaca Al-Fatihah :\n" +
                        "  بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ - ١\n" +
                        " bismillāhir-raḥmānir-raḥīm\n " +
                        "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِيْنَۙ - ٢\n" +
                        " al-ḥamdu lillāhi rabbil-'ālamīn\n" +
                        " الرَّحْمٰنِ الرَّحِيْمِۙ - ٣\n" +
                        "ar-raḥmānir-raḥīm\n" +
                        " مٰلِكِ يَوْمِ الدِّيْنِۗ  \n" +
                        " māliki yaumid-dīn \n" +
                        "اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَعِيْنُۗ ٥  \n" +
                        "  iyyāka na'budu wa iyyāka nasta'īn\n " +
                        "اِهْدِنَا الصِّرَاطَ الْمُسْتَقِيْمَ ۙ ٦ \n" +
                        "ihdinaṣ-ṣirāṭal-mustaqīm\n" +
                        " صِرَاطَ الَّذِيْنَ اَنْعَمْتَ عَلَيْهِمْ ەۙ غَيْرِ الْمَغْضُوْبِ عَلَيْهِمْ وَلَا الضَّاۤلِّيْنَ -  ٧\n" +
                        " ṣirāṭallażīna an'amta 'alaihim gairil-magḍụbi 'alaihim wa laḍ-ḍāllīn\n\n" +
                        "\n صِرَاطَ الَّذِيْنَ اَنْعَمْتَ عَلَيْهِمْ ەۙ غَيْرِ الْمَغْضُوْبِ عَلَيْهِمْ وَلَا الضَّاۤلِّيْنَ -  ٧" +
                        " ṣirāṭallażīna an'amta 'alaihim gairil-magḍụbi 'alaihim wa laḍ-ḍāllīn\n\n" +
                        "   Artinya : \nDengan nama Allah Yang Maha Pengasih, Maha Penyayang. Segala puji bagi Allah, " +
                        "Tuhan seluruh alam, Yang Maha Pengasih, Maha Penyayang, Pemilik hari pembalasan." +
                        " Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami mohon pertolongan. " +
                        "Tunjukilah kami jalan yang lurus, (yaitu) jalan orang-orang yang telah Engkau beri nikmat " +
                        "kepadanya; bukan (jalan) mereka yang dimurkai, dan bukan (pula jalan) mereka yang sesat.\n" +
                        "\n selanjutnya membaca ayat-ayat al-qur'an",
                R.drawable.takbir,
                "ghgVQbp6okU",
                "2.Lakukan rukuk dan membaca bacaan rukuk :\n" +
                        "3x سُبْحَانَ رَبِّيَ الْعَظِيْمِ وَبِحَمْدِهِ\n" +
                        "Subhaana Rabbiyal ‘Adziimi Wa Bihamdih. (Dibaca 3x)\n\n" +
                        "Artinya, “Maha Suci Tuhan yang Maha Agung serta memujilah aku kepada-Nya.”",
                R.drawable.rukuk,
                "2fe5xz4zw9w",
                "3. Melakukan iktidal dengan tuma'ninah diiringi dengan membaca bacaan iktidal. \n" +
                        "سَمِعَ اللهُ لِمَنْ حَمِدَهُ\n" +
                        "Sami’alloohu Liman Hamidah\n" +
                        "\n" +
                        "Pada waktu berdiri tegak (I’tidal) seraya membaca :\n" +
                        "\n" +
                        "رَبَّنَا لَكَ الْحَمْدُ مِلْءُ السَّموَاتِ وَمِلْءُ اْلاَرْضِ وَمِلْءُمَاشِئْتَ مِنْ شَيْئٍ بَعْدُ\n" +
                        "Rabbanaa Lakal Hamdu Milus Samaawati Wa Milul Ardhi Wa Mil Umaasyi’ta Min Syaiin Ba’du.\n" +
                        "\n" +
                        "Artinya: Wahai Tuhan Kami ! Hanya Untuk-Mu lah Segala Puji, Sepenuh Langit Dan Bumi Dan Sepenuh Barang Yang Kau Kehendaki Sesudahnya.",
                R.drawable.iktidal,
                "XIR1QJNlfHU",
                "4. Sujud pertama\n" +
                        "Kemudian melakukan sujud dengan tuma'ninah dengan membaca bacaan sujud :\n" +
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
                R.drawable.sujud1,
                "wP82iwh5xeE",
                "5. Duduk diantara 2 sujud\n" +
                        "Melakukan duduk diantara 2 sujud dengan posisi duduk tawaruk." +
                        "Dilanjutkan dengan membaca bacaan duduk diantara 2 sujud.\n" +
                        "رَبِّ اغْفِرْ لِي ، وَارْحَمْنِي ، وَاجْبُرْنِي ، وَارْفَعْنِي ، وَارْزُقْنِي ، وَاهْدِنِي\n" +
                        "Robbighfirlii warhamnii, wajburnii, warfa’nii, warzuqnii, wahdinii\n" +
                        "   Artinya: “Ya Allah ampunilah aku, rahmatilah aku, perbaikilah keadaanku, tinggikanlah derajatku, berilah rezeki dan petunjuk untukku”",
                R.drawable.dudukdiantara2sujud,
                "arTaGBH_S-s",
                "6. Melakukan sujud ke-2 dengan tuma'ninah dengan membaca bacaan sujud. Setelah " +
                        "selesai sujud ke-2 kemudian berdiri untuk melanjutkan rakaat berikutnya.\n" +
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
              R.drawable.sujud2
            )
        )

//        4

        sholat.add(
            SholatModel(
                "uNbbnQveX0g",
                "Rakaat ke-4    :\n" +
                        "1. Berdiri dan Membaca Al-Fatihah :\n" +
                        "  بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ - ١\n" +
                        " bismillāhir-raḥmānir-raḥīm\n " +
                        "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِيْنَۙ - ٢\n" +
                        " al-ḥamdu lillāhi rabbil-'ālamīn\n" +
                        " الرَّحْمٰنِ الرَّحِيْمِۙ - ٣\n" +
                        "ar-raḥmānir-raḥīm\n" +
                        " مٰلِكِ يَوْمِ الدِّيْنِۗ  \n" +
                        " māliki yaumid-dīn \n" +
                        "اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَعِيْنُۗ ٥  \n" +
                        "  iyyāka na'budu wa iyyāka nasta'īn\n " +
                        "اِهْدِنَا الصِّرَاطَ الْمُسْتَقِيْمَ ۙ ٦ \n" +
                        "ihdinaṣ-ṣirāṭal-mustaqīm\n" +
                        " صِرَاطَ الَّذِيْنَ اَنْعَمْتَ عَلَيْهِمْ ەۙ غَيْرِ الْمَغْضُوْبِ عَلَيْهِمْ وَلَا الضَّاۤلِّيْنَ -  ٧\n" +
                        " ṣirāṭallażīna an'amta 'alaihim gairil-magḍụbi 'alaihim wa laḍ-ḍāllīn\n\n" +
                        "   Artinya : \nDengan nama Allah Yang Maha Pengasih, Maha Penyayang. Segala puji bagi Allah, " +
                        "Tuhan seluruh alam, Yang Maha Pengasih, Maha Penyayang, Pemilik hari pembalasan." +
                        " Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami mohon pertolongan. " +
                        "Tunjukilah kami jalan yang lurus, (yaitu) jalan orang-orang yang telah Engkau beri nikmat " +
                        "kepadanya; bukan (jalan) mereka yang dimurkai, dan bukan (pula jalan) mereka yang sesat.\n" ,
                        R.drawable.takbir,
                        "ghgVQbp6okU",
                "2. Lakukan rukuk dan membaca bacaan rukuk :\n" +
                        "\n3x سُبْحَانَ رَبِّيَ الْعَظِيْمِ وَبِحَمْدِهِ" +
                        "Subhaana Rabbiyal ‘Adziimi Wa Bihamdih. (Dibaca 3x)\n\n" +
                        "Artinya, “Maha Suci Tuhan yang Maha Agung serta memujilah aku kepada-Nya.”",
                R.drawable.rukuk,
                "2fe5xz4zw9w",
                "3. Melakukan iktidal dengan tuma'ninah diiringi dengan membaca bacaan iktidal.\n \n" +
                        "سَمِعَ اللهُ لِمَنْ حَمِدَهُ\n" +
                        "Sami’alloohu Liman Hamidah\n" +
                        "\n" +
                        "Pada waktu berdiri tegak (I’tidal) seraya membaca :\n" +
                        "\n" +
                        "رَبَّنَا لَكَ الْحَمْدُ مِلْءُ السَّموَاتِ وَمِلْءُ اْلاَرْضِ وَمِلْءُمَاشِئْتَ مِنْ شَيْئٍ بَعْدُ\n" +
                        "Rabbanaa Lakal Hamdu Milus Samaawati Wa Milul Ardhi Wa Mil Umaasyi’ta Min Syaiin Ba’du.\n" +
                        "\n" +
                        "Artinya: Wahai Tuhan Kami ! Hanya Untuk-Mu lah Segala Puji, Sepenuh Langit Dan Bumi Dan Sepenuh Barang Yang Kau Kehendaki Sesudahnya.",
                R.drawable.iktidal,
                "XIR1QJNlfHU",
                "4. Sujud pertama\n" +
                        "Kemudian melakukan sujud dengan tuma'ninah dengan membaca bacaan sujud.\n" +
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
                R.drawable.sujud1,
                "wP82iwh5xeE",
                "5. Duduk diantara 2 sujud\n" +
                        "Melakukan duduk diantara 2 sujud dengan posisi duduk" +
                        "tawaruk. Dilanjutkan dengan membaca bacaan duduk diantara 2 sujud.\n" +
                        "\n" +
                        "رَبِّ اغْفِرْ لِي ، وَارْحَمْنِي ، وَاجْبُرْنِي ، وَارْفَعْنِي ، وَارْزُقْنِي ، وَاهْدِنِي\n" +
                        "Robbighfirlii warhamnii, wajburnii, warfa’nii, warzuqnii, wahdinii\n" +
                        "   Artinya: “Ya Allah ampunilah aku, rahmatilah aku, perbaikilah keadaanku, tinggikanlah derajatku, berilah rezeki dan petunjuk untukku”",
                R.drawable.dudukdiantara2sujud,
                "akcv1eciVEE",
                "6. Melakukan sujud ke-2 dengan tuma'ninah dengan membaca bacaan sujud." +
                        " Setelah selesai sujud ke-2 kemudian berdiri untuk melanjutkan rakaat berikutnya.\n\n" +
                        "سُبْحَانَ رَبِّيَ الْأَعْلَى وَبِحَمْدِهِ\n" +
                        "Subhaana rabbiyal a'la wa bihamdihi (3x)\n" +
                        "Artinya: Maha Suci Rabb-ku Yang Maha Tinggi, dan memujilah aku kepada-Nya.",
                R.drawable.sujud2,
                "jTNRmBvOgiw",
                "7. Tahiyat Akhir dengan Duduk Iftirasy\n" +
                        "Untuk rakaat terakhir atau rakaat ke-4, setelah sujud terakhir maka pernyataan denga duduk iftirasy.\n" +
                        "\n" +
                        "Ketika melakukan duduk iftirasy pada rakaat terakhir setelah sujud terakhir," +
                        " membaca tahiyat Akhir . Setelah itu dengan membaca doa sholawat nabi yang " +
                        "ditukukan kepada nabi Ibrahim dan nabi Muhammad.:\n" +
                        "التَّحِيَّاتُ الْمُبَارَكَاتُ الصَّلَوَاتُ الطَّيِّبَاتُ لِلَّهِ السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِىُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ , أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ , اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ ، وَعَلَى آلِ مُحَمَّدٍ ، كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ ، إِنَّكَ حَمِيدٌ مَجِيدٌ ، اللَّهُمَّ بَارِكْ عَلَى مُحَمَّدٍ ، وَعَلَى آلِ مُحَمَّدٍ ، كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ ، وَعَلَى آلِ إِبْرَاهِيمَ ، إِنَّكَ حَمِيدٌ مَجِيدٌ\n" +
                        "\n" +
                        "“At_Tahiyyaatul Mubaarakaatush Shalawaatuth Thoyyibaatulillaah. As_Salaamu’Alaika Ayyuhan Nabiyyu Wa Rahmatullaahi Wabarakaatuh, Assalaamu’Alaina Wa’Alaa Ibaadillaahishaalihiin.\n" +
                        "\n" +
                        "Asyhaduallaa Ilaaha Illallaah, Wa Asyhadu Anna Muhammad Rasuulullaah.\n" +
                        "\n" +
                        "Allaahumma Shalli’Alaa Muhammad, Wa’Alaa Aali Muhammad. Kamaa Shallaita Alaa Ibraahiim Wa Alaa Aali Ibraahiim.\n" +
                        "\n" +
                        "Wabaarik’Alaa Muhammad Wa Alaa Aali Muhammad. Kamaa Baarakta Alaa Ibraahiim Wa Alaa Aali Ibraahiim, Fil’Aalamiina Innaka Hamiidum Majiid.”\n" +
                        "\n" +
                        "Artinya: Segala kehormatan, dan keberkahan, kebahagiaan dan kebaikan itu punya Allah. Keselamatan atas Nabi Muhammad, juga rahmat dan berkahnya. Keselamatan dicurahkan kepada kami dan atas seluruh hamba Allah yang sholeh.\n" +
                        "\n" +
                        "Aku bersaksi tidak ada sesembahan yang berhak disembah kecuali Allah. Dan aku bersaksi bahwa Nabi Muhammad adalah utusan Allah.\n" +
                        "\n" +
                        "Ya Allah, limpahilah rahmat atas keluarga Nabi Muhammad.Seperti rahmat yang Engkau berikan kepada Nabi Ibrahim dan keluarganya.\n" +
                        "\n" +
                        "limpahilah berkah atas Nabi Muhammad beserta para keluarganya. Seperti berkah yang Engkau berikan kepada Nabi Ibrahim dan keluarganya. Engkaulah Tuhan yang sangat terpuji lagi sangat mulia diseluruh alam.”\n" +
                        "\n" +
                        "Salam ke kanan dan ke kiri.",
                R.drawable.tahiyatakhir
            )
        )




        return sholat
    }
}