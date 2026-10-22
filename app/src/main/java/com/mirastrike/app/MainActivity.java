package com.mirastrike.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.rgb(18, 18, 18));

        TextView titulo = new TextView(this);
        titulo.setText("MIRASTRIKE");
        titulo.setTextColor(Color.GREEN);
        titulo.setTextSize(30);
        titulo.setGravity(Gravity.CENTER);

        TextView descricao = new TextView(this);
        descricao.setText(
            "AUXILIO DE MIRA VISUAL\n\n" +
            "Projeto para Android 11+\n" +
            "Sem root e sem aimbot"
        );
        descricao.setTextColor(Color.WHITE);
        descricao.setTextSize(17);
        descricao.setGravity(Gravity.CENTER);

        layout.addView(titulo);
        layout.addView(descricao);

        setContentView(layout);
    }
}
