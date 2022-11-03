package com.example.uts_rpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListAnggota extends AppCompatActivity {
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_anggota);

        btn_1 = (Button)findViewById(R.id.btn_nadia);
        btn_2 = (Button)findViewById(R.id.btn_renna);
        btn_3 = (Button)findViewById(R.id.btn_septian);
        btn_4 = (Button)findViewById(R.id.btn_xyla);
        btn_5 = (Button)findViewById(R.id.btn_yoga);

        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota1.class);
                startActivity(intReg);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota2.class);
                startActivity(intReg);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota3.class);
                startActivity(intReg);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota4.class);
                startActivity(intReg);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota5.class);
                startActivity(intReg);
            }
        });
    }
}