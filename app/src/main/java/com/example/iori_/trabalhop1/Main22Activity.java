package com.example.iori_.trabalhop1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main22Activity extends ActionBarActivity {

    EditText login_user;
    EditText camposenha;
    Button   buttonEntrar;
    Button   botaoVoltar;
    Boolean camposValidos;



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

            //login_user = (EditText) findViewById(R.id.login_user);
            //camposenha = (EditText) findViewById(R.id.camposenha);

            botaoVoltar = (Button) findViewById(R.id.botaoVoltar);

           Intent botaoVoltar = new Intent(getApplicationContext(),
                   MainActivity.class);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }


        });


    }

    }
