package com.example.fcbapp;

import java.util.ArrayList;

public class PlayerData {
    private static String[] playerName = {
        "Marc Andre Ter Stegen",
        "Neto Murara",
        "Samuel Umtiti",
        "Gerard Pique",
        "Jordi Alba",
        "Nelson Semedo",
        "Clement Lenglet",
        "Sergi Roberto",
        "Frenkie de Jong",
        "Ivan Rakitic",
        "Sergio Busquets",
        "Arthur Melo",
        "Arturo Vidal",
        "Ousmane Dembele",
        "Antoine Griezmann",
        "Luis Suarez",
        "Lionel Messi",
        "Ernesto Valverde ( MANAGER ) "
    };

    private static String[] playerDetails = {
            "Marc-André ter Stegen adalah seorang pemain sepak bola asal Jerman yang saat ini bermain untuk bermain di Barcelona sebagai penjaga gawang. Lahir pada tanggal 30 April 1992",
            "Norberto Murara Neto yang biasa dipanggil Neto adalah seorang pemain sepak bola berkewarganegaraan Brasil yang bermain untuk klub F.C. Barcelona bermain sebagai posisi penjaga gawang. Lahir pada tanggal 19 Juli 1989",
            "Samuel Yves Umtiti adalah seorang pemain sepak bola berkewarganegaraan Prancis kelahiran Kamerun yang bermain untuk klub FC Barcelona biasa bermain pada posisi bek. Umtiti memulai karier juniornya di klub Lyon kemudian memulai karier seniornya di klub tersebut sejak tahun 2011. Lahir pada tanggal 14 November 1993",
            "Gerard Piqué Bernabeu merupakan seorang pemain sepak bola berkebangsaan Spanyol yang dulu pernah membela klub Manchester United F.C.. Dia membela klub tersebut dari FC Barcelona B sejak 1 Juli 2004. Pada musim 2006-2007 dia dipinjamkan ke Real Zaragoza. Dia membela tim nasional Spanyol U17, U19, dan U21. Lahir pada tanggal 2 Februari 1987",
            "Jordi Alba Ramos adalah seorang pemain sepak bola berkewarganegaraan Spanyol yang bermain untuk klub FC Barcelona pada posisi bek. Karir profesionalnya diawali dengan bermain di klub Valencia CF. Lahir pada tanggal 21 Maret 1989",
            "Nélson Cabral Semedo adalah seorang pemain sepak bola profesional berkebangsaan Portugis yang bermain sebagai bek kanan untuk Barcelona dan tim nasional Portugal. Semedo memulai kariernya di Sintrense sebelum bergabung dengan Benfica pada tahun 2012. Lahir pada tanggal 16 November 1993",
            "Clément Nicolas Laurent Lenglet adalah pemain sepak bola profesional Prancis yang bermain sebagai bek tengah untuk klub Spanyol Barcelona dan tim nasional Prancis. Dia memulai karirnya dengan Nancy, membuat 85 penampilan dari debutnya di tahun 2013, dan memenangkan gelar Ligue 2 di musim 2015-16. Lahir pada tanggal 17 Juni 1995",
            "Sergi Roberto Carnicer adalah pemain sepak bola Spanyol yang bermain untuk FC Barcelona, berposisi terutama sebagai bek sayap, ia juga dapat bermain di posisi gelandang tengah, gelandang bertahan atau gelandang sayap. Lahir pada tanggal 7 Februari 1992",
            "Frenkie de Jong adalah pemain sepak bola profesional Belanda yang bermain sebagai gelandang untuk klub Spanyol Barcelona dan tim nasional Belanda. De Jong memulai karir profesionalnya di Willem II pada 2015 dan ditransfer ke Ajax dengan biaya € 1 setahun kemudian. Lahir pada tanggal 12 Mei 1997",
            "Ivan Rakitić adalah seorang pemain sepak bola berkewarganegaraan Kroasia kelahiran Swiss yang bermain untuk klub Barcelona pada posisi gelandang. Rakitic memulai karier profesionalnya di Basel dan menghabiskan dua musim dengan mereka sebelum ia ditandatangani oleh Schalke 04. Lahir pada tanggal 10 Maret 1988",
            "Sergio Busquets merupakan seorang pemain sepak bola Spanyol yang berposisi sebagai gelandang bertahan. Saat ini ia bermain untuk Barcelona. Ia juga bermain untuk tim nasional Spanyol. Lahir pada tanggal 16 Juli 1988",
            "Arthur Henrique Ramos de Oliveira Melo, umumnya dikenal sebagai Arthur Melo atau hanya Arthur, adalah pemain sepak bola Brasil yang bermain sebagai gelandang untuk klub Spanyol Barcelona dan tim nasional Brasil. Lahir pada tanggal 12 Agustus 1996",
            "Arturo Erasmo Vidal Pardo adalah seorang pemain sepak bola Chili yang bermain sebagai gelandang untuk klub F.C. Barcelona. Dia bisa bermain di belakang maupun di tengah. Vidal mengawali kariernya di klub Chile, Colo-Colo. Bersama Colo-Colo, dia menjuarai Liga Chile. Lahir pada tanggal 22 Mei 1897",
            "Ousmane Dembélé adalah pemain sepak bola profesional Prancis yang bermain untuk FC Barcelona dan tim nasional Prancis. Lahir pada tanggal 15 Mei 1997",
            "Antoine Griezmann adalah seorang pemain sepak bola Prancis yang saat ini bermain untuk klub FC Barcelona sebagai pemain sayap kiri atau penyerang. Terkenal karena akselerasi dan larinya yang cepat, ia saat ini mewakili Prancis di level senior dan masuk dalam skuat Piala Dunia 2014 dan 2018 silam. Lahir pada tanggal 21 Maret 1991",
            "Luis Alberto Suárez Díaz adalah seorang pemain sepak bola professional Uruguay yang bermain di posisi striker untuk klub FC Barcelona Dia juga anggota tim nasional Uruguay. Pada tahun 2006, Suárez pindah ke Belanda untuk bermain bagi Groningen di Eredivisie. Suárez ditransfer ke Ajax pada tahun 2007. Lahir pada tanggal 24 Januari 1987",
            "Lionel Andrés \"Leo\" Messi adalah seorang pemain sepak bola Argentina yang saat ini bermain untuk FC Barcelona dan merupakan kapten tim nasional sepak bola Argentina dan FC Barcelona, bermain sebagai penyerang. Ia adalah pencetak gol terbanyak Barcelona sepanjang sejarah. Lahir pada tanggal 24 Juni 1987",
            "Ernesto Valverde Tejedor (lahir di Viandar de la Vera, 9 Februari 1964; umur 55 tahun) adalah seorang mantan pemain sepak bola berkewarganegaraan Spanyol yang kini menjadi manajer klub Barcelona. Valverde memulai kariernya sebagai pemain di klub Alavés kemudian pernah juga membela klub Sestao, Espanyol, Barcelona, Athletic Bilbao, dan Mallorca Setelah pensiun sebagai pemain kemudian memulai karier kepelatihannya sebagai pelatih tim senior pada klub Athletic Bilbao, Espanyol, Olympiacos dan Villarreal sebelum menangani Valencia sejak tahun 2012."

    };

    private static int[] playerImages = {
            R.drawable.mats,
            R.drawable.neto,
            R.drawable.umtiti,
            R.drawable.pique,
            R.drawable.alba,
            R.drawable.semedo,
            R.drawable.lenglet,
            R.drawable.roberto,
            R.drawable.frenkie,
            R.drawable.rakitic,
            R.drawable.busi,
            R.drawable.arthur,
            R.drawable.vidal,
            R.drawable.dembele,
            R.drawable.grizi,
            R.drawable.suarez,
            R.drawable.messi,
            R.drawable.valverde
    };

    static ArrayList<Player> getListData(){
        ArrayList<Player> list = new ArrayList<>();

        for (int position = 0; position < playerName.length; position++){
            Player player = new Player();
            player.setName(playerName[position]);
            player.setDetail(playerDetails[position]);
            player.setPhoto(playerImages[position]);
            list.add(player);
        }
        return list;
    }
}
