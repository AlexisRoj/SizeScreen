package com.innovagenesis.aplicaciones.android.sizescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Botones(View view) {
        /**
         * Ejecuta todos los botones en un mismo metodo
         * */
        Intent intent = null;

        switch (view.getId()) {

            case R.id.vab:
                intent = new Intent(this, VistaActionBar.class);
                break;
            case R.id.fs:
                intent = new Intent(this, VistaFullScreen.class);
                break;
            case R.id.nab:
                intent = new Intent(this, VistaNoActionBar.class);
                break;
            case R.id.fsaa:
                intent = new Intent(this, VistaFullScreenActionBar.class);
                break;
        }
        startActivity(intent);
    }

}





