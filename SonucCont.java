package com.eka.Oryantiring_Ogretimi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SonucCont extends OriTest
    {
    public TextView txtDogru;
    public TextView txtYanlis;
    public TextView txtBos;
    public TextView txtNot;
    public TextView txtSonuc;
    public Button   Main;

    public  int sSoru=10;
    public  int sDogru=10;
    public  int sYanlis=0;
    public  int sBos=0;
    public  int Not=0;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sonuc);

        Main=(Button) findViewById(R.id.btnMain);

        txtDogru = (TextView) findViewById(R.id.txtDogru);
        txtYanlis= (TextView) findViewById(R.id.txtYanlis);
        txtBos   = (TextView) findViewById(R.id.txtBos);
        txtNot   = (TextView) findViewById(R.id.txtNot);
        txtSonuc = (TextView) findViewById(R.id.txtSonuc);

         sDogru = OriTest.dogru;
         sYanlis= OriTest.yanlis;
         sBos   = OriTest.bos;
         sSoru  = OriTest.soru;
/*
        sDogru = Dogru;
        sYanlis= Yanlis;
        sBos   = Bos;
       */
//        Sonuc();
        //Notu hesaplat
        NotHesap();

        //Sonuçları Yazdır
        SonucYaz();

        Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SonucCont.this,OriTest.class));
            }
        });
    }

    private void NotHesap() {
        int yanlis,bos,dogru,soru;
        try {

            Not=((100/sSoru)*(sDogru-(sYanlis/4))) ;
            if (Not<0) {Not=0;}

        }  catch (Exception e) {
            Toast.makeText(this,"İşlem Hatası",Toast.LENGTH_SHORT).show();
        }

    }

    private void SonucYaz() {


        txtDogru.setText(Integer.toString(sDogru));
        txtYanlis.setText(Integer.toString(sYanlis));
        txtBos.setText(Integer.toString(sBos));
        txtNot.setText(Integer.toString(Not));
    }
}




















