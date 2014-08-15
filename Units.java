package com.eka.Oryantiring_Ogretimi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: AndroDevTurk
 * Date: 05.06.2014
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class Units extends Activity {

    public Button unite1,unite2,unite3,unite4,unite5;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.units);

        unite1  = (Button) findViewById(R.id.BtnUnt1);
        unite1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //            Text.setText(Edit.getText().toString());
                startActivity(new Intent(Units.this, Unit1.class));  }
        });

        unite2  = (Button) findViewById(R.id.BtnUnt2);
        unite2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {startActivity(new Intent(Units.this, Unit2.class));  }});


        unite3  = (Button) findViewById(R.id.BtnUnt3);
        unite3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {startActivity(new Intent(Units.this, Unit3.class));  }});


        unite4  = (Button) findViewById(R.id.BtnUnt4);
        unite4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {startActivity(new Intent(Units.this, Unit4.class));  }});


        unite5  = (Button) findViewById(R.id.BtnUnt3);
        unite5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {startActivity(new Intent(Units.this, Unit3.class));  }});




    }



}
