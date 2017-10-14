package com.ikahimki.ikahimki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
public class UnggahFile extends AppCompatActivity {


    EditText editText1 ,editText2; //Deklarasi object dari class EdiText
    String text1 ,text2; //Deklarasi object string


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unggah_file);
        getSupportActionBar().setTitle("Ikahimki");
        getSupportActionBar().setSubtitle("Unggah Berkas");
        final EditText ed = (EditText) findViewById(R.id.password);
        CheckBox c = (CheckBox) findViewById(R.id.tampilkan_pass);

        c.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    ed.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    ed.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }

            }
        });

    }

    public void LoginAdm(View view) {
        //Method onClick pada Button

        editText1 = (EditText)findViewById(R.id.username);
        editText2 = (EditText) findViewById(R.id.password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();

        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
        //Login sukses dan masuk ke activity 2
        if ((text1.contains("ikahimki"))&&((text2.contains("ikahimki1618")))) {
            Toast.makeText(this, "Berhasil Masuk!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(UnggahFile.this, LoginUploadFile.class);
            startActivity(intent);
        }

        else if ((text1.matches("")||text2.matches("")))
        {
            Toast.makeText(this, "Isikan Nama dan Kata Sandi", Toast.LENGTH_SHORT).show();

        }

        else {

            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }

    }


}