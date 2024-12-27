package com.example.hesaplama;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

           Button buton = findViewById(R.id.buttonHesapla);
            buton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText edit1= findViewById(R.id.edit1);
                    double not1=Double.parseDouble(edit1.getText().toString());
                    EditText edit2= findViewById(R.id.edit2);
                    double not2= Double.parseDouble(edit2.getText().toString());

                    double ortalama=(not1+not2)/2;

                    TextView sonuc= findViewById(R.id.textPuan);
                    sonuc.setText(Double.toString(ortalama));
                }
            });
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}