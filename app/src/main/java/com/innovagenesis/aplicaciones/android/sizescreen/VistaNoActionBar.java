package com.innovagenesis.aplicaciones.android.sizescreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;


public class VistaNoActionBar extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Se define la propiedad para que no agregue la barra de accion
        * */

        requestWindowFeature(Window.FEATURE_NO_TITLE); //Quita barra de accion

        setContentView(R.layout.fragment_noactionbar);

    }
}


