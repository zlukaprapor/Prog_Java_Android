package com.example.prog_java_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SendMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        final EditText editTextMessage = findViewById(R.id.editTextMessage);
        Button btnSendMessage = findViewById(R.id.btnSendMessage);

        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Отримати текст з EditText
                String message = editTextMessage.getText().toString();

                // Відправити повідомлення до ReceiveMessageActivity з введеним текстом
                Intent intent = new Intent(SendMessageActivity.this, ReceiveMessageActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);
            }
        });
    }
}
