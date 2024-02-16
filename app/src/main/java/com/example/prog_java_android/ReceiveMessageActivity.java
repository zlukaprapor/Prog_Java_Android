package com.example.prog_java_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        TextView textViewMessage = findViewById(R.id.textViewMessage);
        Button btnBack = findViewById(R.id.btnBack);

        // Отримати повідомлення з інтенту
        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("message");
            textViewMessage.setText(message);
        }

        // Додати обробник для кнопки "назад"
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Повернутися до SendMessageActivity
                Intent backIntent = new Intent(ReceiveMessageActivity.this, SendMessageActivity.class);
                startActivity(backIntent);
            }
        });
    }
}

