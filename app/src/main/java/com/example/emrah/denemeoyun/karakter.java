package com.example.emrah.denemeoyun;

/**
 * Created by emrah on 11.10.2017.
 */

public class karakter {
    public int hareketSayisi;
    public int kilo;
    public int saldiriGucu;

    public String yemek(){
        if(hareketSayisi > 0){
            kilo++;
            hareketSayisi--;
            return "Yemek yendi.";
        }
        else
        {
            return "Hareket hakkı yok.";
        }
    }
    public String saldir(){
        if(hareketSayisi > 0){
            saldiriGucu++;
            hareketSayisi--;
            return "Saldırı yapıldı.";
        }
        else
        {
            return "Hareket hakkı yok.";
        }
    }
    public String uyu(){
        if(hareketSayisi > 0){
            hareketSayisi--;
            return "Uyundu.";
        }
        else
        {
            return "Hareket hakkı yok.";
        }
    }

    @Override
    public  String toString(){
        return "Kilo:" + kilo + "\n" + "Saldırı Gücü:" + saldiriGucu + "\n" + "Hareket Sayısı:" + hareketSayisi;
    }
}
