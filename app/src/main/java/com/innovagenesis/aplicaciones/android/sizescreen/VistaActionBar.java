package com.innovagenesis.aplicaciones.android.sizescreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class VistaActionBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Por defecto las vitas tienen ActionBar no se configura nada
         * */

        setContentView(R.layout.fragment_actionbar);
    }
}
