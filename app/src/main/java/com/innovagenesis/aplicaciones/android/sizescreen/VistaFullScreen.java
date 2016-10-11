package com.innovagenesis.aplicaciones.android.sizescreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;


public class VistaFullScreen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Implementa la vista en full screen
         * */

        requestWindowFeature(Window.FEATURE_NO_TITLE); // Quita barra de accion
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //Crea pantalla completa

        setContentView(R.layout.fragment_full_screen);
    }
}
