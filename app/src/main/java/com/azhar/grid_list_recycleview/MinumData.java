package com.azhar.grid_list_recycleview;

import java.util.ArrayList;

public class MinumData {
    public static String[][] data = new String[][]{
            {"Teh Es", "Mantap", "https://i1.wp.com/shopee.co.id/inspirasi-shopee/wp-content/uploads/2018/04/Segarkan-Dahaga-dengan-Minuman-Asli-Nusantara.jpg?fit=3531%2C2824&ssl=1"},
            {"Moktail", "Segar", "https://hellosehat.com/wp-content/uploads/2017/07/minuman-manis-bikin-gemuk.jpg"},
            {"Es Jeruk", "Nikmat", "https://cdns.klimg.com/merdeka.com/i/w/news/2017/12/21/921720/670x335/5-minuman-yang-bakal-bikin-tubuh-lebih-sehat-di-musim-hujan.jpg"},
            {"Es Kelapa", "Fresh", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtiaOwjsPJ189DgFI42ntvueh7SSSZxXQPsibR2icqQorrlAgx"},
            {"Jus Pokat", "Nagih", "data:image/jpeg;base64,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"},
            {"Jus Apel", "Sehat", "https://i0.wp.com/www.beritainfo.web.id/wp-content/uploads/2018/01/cara-membuat-jus-apel-yang-enak.png?fit=392%2C411&ssl=1"},
            {"Capcin", "Lumayan", "https://3.bp.blogspot.com/-ibGwlRV-eYs/VxGwJVAjGaI/AAAAAAAAArk/Y2wHpJvD_6E7R8VJp2tyjDJz8RdOhWm8gCLcB/s1600/es%2Bcapcin.jpg"},
            {"Exstra Joss", "Minumannya Laki", "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/8/8/70969808/70969808_8ba74582-f21c-4a46-9ef0-f8d1937a6e4b_608_608.jpg"},
            {"Kiranti", "Tidak untuk lelaki", "http://www.tuquh.com/image/cache/data/000BARU-BARU/Kiranti-500x500.jpg"},
            {"Kuku Bima", "Rosso", "data:image/jpeg;base64,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"},
    };

    public static ArrayList<Minum> getListData() {
        Minum minum = null;
        ArrayList<Minum> list = new ArrayList<>();
        for (String[] aData : data) {
            minum = new Minum();
            minum.setName(aData[0]);
            minum.setRemarks(aData[1]);
            minum.setPhoto(aData[2]);
            list.add(minum);
        }
        return list;
    }
}
