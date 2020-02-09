package com.example.miniapps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final EditText emailEditText = findViewById(R.id.etEmail);
        final EditText passEditText = findViewById(R.id.etPass);
        final Button loginBtn = findViewById(R.id.btnLogin);

    }
}
