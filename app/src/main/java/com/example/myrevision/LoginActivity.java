package com.example.myrevision;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity
{
    EditText username, password;
    Button btnLogin;

    public final static String MESSAGE_KEY_USERNAME = "com.example.MyRevision.message_key_username";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("Syazrina") && password.getText().toString().equals("syaz123")){
                    String message = username.getText().toString();
                    Intent intent = new Intent(LoginActivity.this, MenuHomeActivity.class);

                    intent.putExtra(MESSAGE_KEY_USERNAME, message);

                    startActivity(intent);
                }else{
                    showAlertDialogButton();
                }
            }
        });
    }

    public void send_data(View view)
    {
        username = findViewById(R.id.etUsername);

        String message = username.getText().toString();
        Intent intent = new Intent(LoginActivity.this, MenuHomeActivity.class);

        intent.putExtra(MESSAGE_KEY_USERNAME, message);

        startActivity(intent);
    }

    public void showAlertDialogButton()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //setup the alert builder
        builder.setTitle("Authentication Failed");
        builder.setMessage("Username or Password is Wrong, please try again!");

        //add button
        builder.setPositiveButton("OK", null);

        //create and how the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
