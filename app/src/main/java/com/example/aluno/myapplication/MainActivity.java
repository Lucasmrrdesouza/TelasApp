package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button sobre;
    private Button lab01;
    private Button lab02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        sobre = (Button) findViewById(R.id.buttonSobre);
        lab01 = (Button) findViewById(R.id.buttonLab1);
        lab02 = (Button) findViewById(R.id.buttonLab2);

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Indo para outra tela", Toast.LENGTH_LONG).show();

                // comando para chamar outr atela
                startActivity( new Intent(MainActivity.this, SobreActivity.class));




            }
        });

        lab01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Indo para a tela do laboratório 01", Toast.LENGTH_LONG).show();

                startActivity( new Intent(MainActivity.this, Lab01Activity.class));
            }
        });

        lab02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Indo para a tela do laboratório 02", Toast.LENGTH_LONG).show();

                startActivity(new Intent(MainActivity.this, Lab02Activity.class));

            }
        });

    }
}
