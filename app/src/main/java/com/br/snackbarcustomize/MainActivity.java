package com.br.snackbarcustomize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.br.snackbarcustomize.model.SnackbarCustom;

public class MainActivity extends AppCompatActivity {
    CardView bt1, bt2, bt3, bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (CardView) findViewById(R.id.card_view_1);
        bt2 = (CardView) findViewById(R.id.card_view_2);
        bt3 = (CardView) findViewById(R.id.card_view_3);
        bt4 = (CardView) findViewById(R.id.card_view_4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SnackbarCustom.make(view,
                        "Snackbar Customizado!",
                        0, "#FF4081")
                        .show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SnackbarCustom.make(view,
                        "Snackbar Customizado!",
                        0, "#303F9F")
                        .show();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SnackbarCustom.make(view,
                        "Snackbar Customizado!",
                        0, "#dea537",
                        "#f05401")
                        .show();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SnackbarCustom.make(view,
                        "Snackbar Customizado!",
                        0, "#EDEDED",
                        "#1b7d83")
                        .show();
            }
        });

    }
    }

