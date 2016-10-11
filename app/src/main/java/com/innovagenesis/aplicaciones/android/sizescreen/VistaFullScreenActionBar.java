package com.innovagenesis.aplicaciones.android.sizescreen;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;


public class VistaFullScreenActionBar extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Se inicializa la propiedades de inicio de pantalla
        * */

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);// Hace fullScreen

        setContentView(R.layout.fragment_fullscreeenactionbar);
    }
}
