package com.example.android_inputout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        ImageButton imageButton = findViewById(R.id.btn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++; // num = num + 1
                textView.setText("" + num);

                if(num == 50) { // 필요없는 개념 아직은
                    Toast.makeText(MainActivity.this, "몬스터를 저치하였습니다.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}