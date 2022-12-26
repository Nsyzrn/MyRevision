package com.example.myrevision;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuHomeActivity extends AppCompatActivity
{

    public final static String MESSAGE_KEY_USERNAME = "com.example.MyRevision.message_key_username";

    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuhome);

        tvUsername = findViewById(R.id.tvName);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MESSAGE_KEY_USERNAME);

        tvUsername.setTextSize(40);
        tvUsername.setText(message);
    }

}
