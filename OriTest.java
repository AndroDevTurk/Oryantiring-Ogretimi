package com.eka.Oryantiring_Ogretimi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;




public class OriTest extends Activity implements View.OnClickListener {

    public Button Pas;
    public Button A;
    public Button B;
    public Button C;
    public Button D;
    public Button E;

    public ImageView imgSoru;
    public ImageView imgA;
    public ImageView imgB;
    public ImageView imgC;
    public ImageView imgD;
    public ImageView imgE;

    public TextView txtSoru;
    public TextView txtA;
    public TextView txtB;
    public TextView txtC;
    public TextView txtD;
    public TextView txtE;
    public TextView txtCopyRight;



    public String Cevab[];
    public String MyCvb="Boş";
    public  int Dogru=0;
    public  int Yanlis=0;
    public  int Bos=0;

    public boolean Pass=false;
    public int Unit=1;
    public int Soru=0;
    public int UnitSoru;

    public static int dogru;
    public  static int yanlis;
    public  static int bos;
    public  static int soru;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

      //Değitirilecek Soru ve cevaplar

        imgSoru= (ImageView) findViewById(R.id.imgSoru);
        imgA = (ImageView) findViewById(R.id.imgA);
        imgB = (ImageView) findViewById(R.id.imgB);
        imgC = (ImageView) findViewById(R.id.imgC);
        imgD = (ImageView) findViewById(R.id.imgD);
        imgE = (ImageView) findViewById(R.id.imgE);

        txtSoru= (TextView) findViewById(R.id.txtSoru);
        txtA= (TextView) findViewById(R.id.txtA);
        txtB= (TextView) findViewById(R.id.txtB);
        txtC= (TextView) findViewById(R.id.txtC);
        txtD= (TextView) findViewById(R.id.txtD);
        txtE= (TextView) findViewById(R.id.txtE);

      //Soru sayısını ve Ceveb anahtarını String dosyasından oku

      UnitSoru= getResources().getInteger(R.integer.u1sorusay);
      Cevab= getResources().getStringArray(R.array.u1cvbkey);

      //switch-case için Buttunların hazırlanışı

      Pas  = (Button) findViewById(R.id.btnPas); Pas.setOnClickListener( this);
        A  = (Button) findViewById(R.id.btnA);     A.setOnClickListener( this);
        B  = (Button) findViewById(R.id.btnB);     B.setOnClickListener( this);
        C  = (Button) findViewById(R.id.btnC);     C.setOnClickListener( this);
        D  = (Button) findViewById(R.id.btnD);     D.setOnClickListener( this);
        E  = (Button) findViewById(R.id.btnE);     E.setOnClickListener( this);


    YeniSoru();

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.btnA:
                MyCvb="A";
                islemler();
                break;
            case R.id.btnB:
                MyCvb="B";
                islemler();
                break;
            case R.id.btnC:
                MyCvb="C";
                islemler();
                break;
            case R.id.btnD:
                MyCvb="D";
                islemler();
                break;
            case R.id.btnE:
                MyCvb="E";
                islemler();
                break;
            case R.id.btnPas:
                Pass=true;
                islemler();
//                startActivity(new Intent(OriTest.this,SonucCont.class));
                break;

        }
    }

    private void islemler() {

            Dogrumu();
            Siradaki();
            YeniSoru();
            Sonuc();
    }

    private void Dogrumu() {

        if (MyCvb.equals(Cevab[Soru])){
            Dogru++;
            Toast.makeText(this, MyCvb+ "  Şıkkı Doğru",Toast.LENGTH_SHORT).show();
        }else if (Pass){
            Bos++;
            Toast.makeText(this, Pass+  "  Soru Boş Geçildi",Toast.LENGTH_SHORT).show();
            Pass=false;
        }else if (Soru!=UnitSoru){
            Yanlis++;
            Toast.makeText(this, Cevab[Soru]+MyCvb+ "  Şıkkı Yanlış"+Yanlis,Toast.LENGTH_SHORT).show();
        }
    }

    private void Siradaki() {
        Soru++;

    }


    public void YeniSoru() {
        int SS=Soru+1;
        if (Soru==0) {
            txtSoru.setText(SS+". "+getResources().getString(R.string.u1s1));
            txtA.setText(getResources().getString(R.string.u1c1a));
            txtB.setText(getResources().getString(R.string.u1c1b));
            txtC.setText(getResources().getString(R.string.u1c1c));
            txtD.setText(getResources().getString(R.string.u1c1d));
            txtE.setText(getResources().getString(R.string.u1c1e));

          imgSoru.setImageDrawable(null);
            imgA.setImageDrawable(null);
            imgB.setImageDrawable(null);
            imgC.setImageDrawable(null);
            imgD.setImageDrawable(null);
            imgE.setImageDrawable(null);

        }else if (Soru==1){
            txtSoru.setText(SS+". "+getResources().getString(R.string.u1s2));
            txtA.setText(getResources().getString(R.string.u1c2a));
            txtB.setText(getResources().getString(R.string.u1c2b));
            txtC.setText(getResources().getString(R.string.u1c2c));
            txtD.setText(getResources().getString(R.string.u1c2d));
            txtE.setText(getResources().getString(R.string.u1c2e));

            imgSoru.setImageDrawable(null);
            imgA.setImageDrawable(null);
            imgB.setImageDrawable(null);
            imgC.setImageDrawable(null);
            imgD.setImageDrawable(null);
            imgE.setImageDrawable(null);

        }else if (Soru==2){
            txtSoru.setText(SS+". "+getResources().getString(R.string.u1s1));
            txtA.setText(getResources().getString(R.string.u1c1a));
            txtB.setText(getResources().getString(R.string.u1c1b));
            txtC.setText(getResources().getString(R.string.u1c1c));
            txtD.setText(getResources().getString(R.string.u1c1d));
            txtE.setText(getResources().getString(R.string.u1c1e));

            imgSoru.setImageDrawable(null);
            imgA.setImageDrawable(null);
            imgB.setImageDrawable(null);
            imgC.setImageDrawable(null);
            imgD.setImageDrawable(null);
            imgE.setImageDrawable(null);

        }else if (Soru==3){
            txtSoru.setText(SS+". "+getResources().getString(R.string.u1s3));
            txtA.setText(getResources().getString(R.string.u1c3a));
            txtB.setText(getResources().getString(R.string.u1c3b));
            txtC.setText(getResources().getString(R.string.u1c3c));
            txtD.setText(getResources().getString(R.string.u1c3d));
            txtE.setText(getResources().getString(R.string.u1c3e));

            imgSoru.setImageDrawable(null);
            imgA.setImageDrawable(null);
            imgB.setImageDrawable(null);
            imgC.setImageDrawable(null);
            imgD.setImageDrawable(null);
            imgE.setImageDrawable(null);

        }

    }

    public void  Sonuc() {

        dogru  = Dogru;
        yanlis = Yanlis;
        bos    = Bos;
        soru   = UnitSoru;


        if ( Soru== UnitSoru){ this.finish(); startActivity(new Intent(OriTest.this,SonucCont.class)); }

    }






}
