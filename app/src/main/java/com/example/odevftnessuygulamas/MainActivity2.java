package com.example.odevftnessuygulamas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {
    EditText txtsonuc,txtboy,txtkilo,urun1,urun2,urun3,urun4,urun5,urun6,cal1,cal2,cal3,cal4,cal5,cal6;
    Button btnkaydet,btnkaydet1,btnkaydet2,btnkaydet3,btnkaydet4,btntopcal;
    HashMap<String,Object> mdata;
    FirebaseFirestore myFstore=FirebaseFirestore.getInstance();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtsonuc=findViewById(R.id.txtsonuc);
        txtboy=findViewById(R.id.height);
        txtkilo=findViewById(R.id.weight);
        urun1=findViewById(R.id.urun1);
        urun2=findViewById(R.id.urun2);
        urun3=findViewById(R.id.urun3);
        urun4=findViewById(R.id.urun4);
        urun5=findViewById(R.id.urun5);
        urun6=findViewById(R.id.urun6);
        cal1=findViewById(R.id.cal1);
        cal2=findViewById(R.id.cal2);
        cal3=findViewById(R.id.cal3);
        cal4=findViewById(R.id.cal4);
        cal5=findViewById(R.id.cal5);
        cal6=findViewById(R.id.cal6);
        btnkaydet=findViewById(R.id.kaydet);
        btnkaydet1=findViewById(R.id.kaydet1);
        btnkaydet2=findViewById(R.id.kaydet2);
        btnkaydet3=findViewById(R.id.kaydet3);
        btnkaydet4=findViewById(R.id.kaydet4);
        btntopcal=findViewById(R.id.btntopcal);


        btnkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String boyu=txtboy.getText().toString();
                String kilosu=txtkilo.getText().toString();
                mdata=new HashMap<>();
                mdata.put("Person height : ",boyu);
                mdata.put("Person weight : ",kilosu);
                myFstore.collection("Sporcular").document("Person")
                        .set(mdata)
                        .addOnCompleteListener(MainActivity2.this, new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(MainActivity2.this,"Kayıt Başarılı", Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });
        btnkaydet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Urun=urun1.getText().toString();
                String Kalorisi=cal1.getText().toString();
                String Urun2=urun2.getText().toString();
                String Kalori=cal2.getText().toString();
                mdata=new HashMap<>();
                mdata.put("Ürün 1 :   ",Urun);
                mdata.put("Kalorisi 1 :   ",Kalorisi);
                mdata.put("Ürün 2 : ",Urun2);
                mdata.put("Kalorisi 2 : ",Kalori);
                myFstore.collection("Sabah Kahvaltısı").document("Menü")
                        .set(mdata)
                        .addOnCompleteListener(MainActivity2.this, new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(MainActivity2.this,"Kaydedildi", Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
        btnkaydet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Urun3=urun3.getText().toString();
                String Kalorisi=cal3.getText().toString();
                String Urun4=urun4.getText().toString();
                String Kalori=cal4.getText().toString();
                mdata=new HashMap<>();
                mdata.put("Ürün 1 :   ",Urun3);
                mdata.put("Kalorisi 1 :   ",Kalorisi);
                mdata.put("Ürün 2 : ",Urun4);
                mdata.put("Kalorisi 2 : ",Kalori);
                myFstore.collection("Öğle Yemeği").document("Menü")
                        .set(mdata)
                        .addOnCompleteListener(MainActivity2.this, new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(MainActivity2.this,"Kaydedildi", Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
        btnkaydet3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Urun5=urun5.getText().toString();
                String Kalorisi=cal5.getText().toString();
                String Urun6=urun6.getText().toString();
                String Kalori=cal6.getText().toString();
                mdata=new HashMap<>();
                mdata.put("Ürün 1 :   ",Urun5);
                mdata.put("Kalorisi 1 :   ",Kalorisi);
                mdata.put("Ürün 2 : ",Urun6);
                mdata.put("Kalorisi 2 : ",Kalori);
                myFstore.collection("Akşam Yemeği").document("Menü")
                        .set(mdata)
                        .addOnCompleteListener(MainActivity2.this, new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(MainActivity2.this,"Kaydedildi", Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
        btntopcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1=Integer.parseInt(cal1.getText().toString());
                int sayi2=Integer.parseInt(cal2.getText().toString());
                int sayi3=Integer.parseInt(cal3.getText().toString());
                int sayi4=Integer.parseInt(cal4.getText().toString());
                int sayi5=Integer.parseInt(cal5.getText().toString());
                int sayi6=Integer.parseInt(cal6.getText().toString());

                int toplam=sayi1+sayi2+sayi3+sayi4+sayi5+sayi6;

                txtsonuc.setText(""+toplam+"");
            }
        });
        btnkaydet4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TopKal=txtsonuc.getText().toString();
                mdata=new HashMap<>();
                mdata.put("Toplam Kalori : ",TopKal);
                myFstore.collection("Kalori").document("Bugünkü aldığınız toplam kalori")
                        .set(mdata)
                        .addOnCompleteListener(MainActivity2.this, new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(MainActivity2.this,"Kaydedildi",Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent geriIntent=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(geriIntent);
    }
}