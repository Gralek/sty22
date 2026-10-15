package com.example.sty22;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText emailTxt = findViewById(R.id.emailTxt);
        EditText hasloTxt = findViewById(R.id.hasloTxt);
        EditText powtorzHaslo = findViewById(R.id.powtorzHaslo);
        Button submitBtn = findViewById(R.id.submitBtn);
        TextView resTxt = findViewById(R.id.resTxt);

        resTxt.setText("Autor: 12345678901");


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailTxt.getText().toString();
                String haslo = hasloTxt.getText().toString();
                String powtorzone = powtorzHaslo.getText().toString();


                if (!email.contains("@")) {
                    resTxt.setText("Nieprawidłowy adres e-mail");
                }

                else if (!haslo.equals(powtorzone)) {
                    resTxt.setText("Hasła się różnią");
                }

                else {
                    resTxt.setText("Witaj " + email);
                }
            }
        });
    }
}