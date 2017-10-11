package com.example.emrah.denemeoyun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    TextView karakterOzellikleri;
    TextView islem;
    Button btnuyu;
    Button btnsaldir;
    Button btnyemek;
    karakter k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        karakterOzellikleri = (TextView)findViewById(R.id.txt_status);
        islem = (TextView)findViewById(R.id.txt_islem);
        btnsaldir = (Button)findViewById(R.id.btn_saldir);
        btnuyu  = (Button)findViewById(R.id.btn_uyu);
        btnyemek = (Button) findViewById(R.id.btn_yemekye);

        btnsaldir.setOnClickListener(this);
        btnuyu.setOnClickListener(this);
       btnyemek.setOnClickListener(this);
        /* btnyemek.setOnClickListener(new View.OnClickListener(){ //bir diğer buton onclick olayı.
            @Override
            public void onClick(View v){
                islem.setText("Yemek yenildi.");
            }
        });
        */
        k = new karakter();
        k.kilo = 15;
        k.saldiriGucu = 100;
        k.hareketSayisi = 10;

        karakterOzellikleri.setText(k.toString());
    }

    @Override
    public void onClick(View v) { //bir diğer buton onclick olayı.
        int id = v.getId();
        if(id==btnuyu.getId()){
            islem.setText(k.uyu());
        }
       else if(id == btnsaldir.getId()){
            islem.setText(k.saldir());
        }
        else if(id==btnyemek.getId()){
            islem.setText(k.yemek());
        }
        karakterOzellikleri.setText(k.toString());

    }
}
