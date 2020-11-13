package id.ac.politeknikharber.uts_mobile_AlfianBayu.pendidikan

import id.ac.politeknikharber.uts_mobile_AlfianBayu.R

object IsiPendidikan {
    private val namaJenjang = arrayOf(
        "Webinar Unair: \"Kitab Tib\", Manuskrip Dunia Obat Masa Lampau",
        "7 Bidang Ilmu Universitas Brawijaya Masuk Peringkat Dunia THE WUR 2021",
        "ITB Peringkat ke-1 Perguruan Tinggi Inovatif 2020 Versi Kemenristek",
        "Daftar Penerima Anugerah Inovasi dan Habibie Prize dari Kemenristek",

    )

    private val des = arrayOf(
        "Sejak zaman dahulu, masyarakat di Nusantara (Indonesia) sudah dekat dengan rempah-rempah. Bahan-bahan dapur itu juga bisa untuk pengobatan. Jadi sebelum ada obat modern, masyarakat yang sakit pasti menggunakan rempah atau tanaman tradisional sebagai obat. Bahkan hingga kini rempah-rempah itu masih digunakan untuk obat",
        "Direktorat Jenderal Pendidikan Tinggi (Ditjen Dikti) Kementerian Pendidikan dan Kebudayaan (Kemendikbud) mengucapkan selamat kepada Universitas Brawijaya ( UB) atas capaiannya di pemeringkatan universitas dunia.",
        "Institut Teknologi Bandung ( ITB) meraih Anugerah Perguruan Tinggi Inovatif Terbaik di Indonesia Tahun 2020 dari Kementerian Riset dan Teknologi/Badan Riset Inovasi Nasional ( Kemenristek/BRIN).",
        "Pada pembukaan Inovasi Indonesia Expo 2020, Selasa (10/11/2020), Kementerian Riset dan Teknologi/Badan Riset dan Inovasi Nasional ( Kemenristek/BRIN) juga memberikan anugerah",

    )

    private val foto = intArrayOf(
        R.drawable.b1,
        R.drawable.b2,
        R.drawable.b3,
        R.drawable.b4 ,

    )


    val dataPendidikan:ArrayList<DataPendidikan>
     get() {
         val listPendidikan:ArrayList<DataPendidikan> = arrayListOf()
         for(i in namaJenjang.indices){
            val data = DataPendidikan()
             data.judul = namaJenjang[i]
             data.des = des[i]
             data.foto = foto[i]
             listPendidikan.add(data)
         }
         return listPendidikan
     }
}