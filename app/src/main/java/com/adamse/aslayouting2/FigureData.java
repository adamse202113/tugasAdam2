package com.adamse.aslayouting2;

import java.util.ArrayList;

public class FigureData {
    private static String[] figureName = {
            "Chris John",
            "Noel & Liam Gallagher",
            "Mick Jagger"
    };
    private static String[] figureDesc = {
            "Seorang pemain tinju kelas dunia yang sudah mengharumkan nama indonesia. beliau berkat prestasinya telah membawa indonesia ke kancah internasional.",
            "Dua orang adik kakak personil band terkenal oasis, mereka selalu berseteru di setiap mereka melakukan tour atau satu show saja.",
            "Vokalis The Rolling Stones dengan gerakan khas nya ketika bernyanyi, hingga kini masih eksis menjadi vokalis"
    };
    private static int[] figureImages = {
            R.drawable.krisjon,
            R.drawable.oasis,
            R.drawable.jagger
    };

    static ArrayList<FigureList> getListData(){
        ArrayList<FigureList> list = new ArrayList<>();
        for (int position = 0; position < figureName.length; position++){
            FigureList figure = new FigureList();
            figure.setName(figureName[position]);
            figure.setDetail(figureDesc[position]);
            figure.setPhoto(figureImages[position]);
            list.add(figure);
        }
        return list;
    }

}
