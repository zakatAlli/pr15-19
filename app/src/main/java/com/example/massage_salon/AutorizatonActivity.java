package com.example.massage_salon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.massage_salon.data.Users;
import com.example.massage_salon.database.DataBaseManager;

public class AutorizatonActivity extends AppCompatActivity {

    TextView registration;
    Button logIn;
    EditText login, pass;
    DataBaseManager dbManager;
    Users user = new Users();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorizaton);
        login = findViewById(R.id.autorizationLogin);
        pass = findViewById(R.id.autorizationPassword);
        registration = findViewById(R.id.txtRegistration);
        dbManager = new DataBaseManager(this);
        logIn = findViewById(R.id.buttonEnter);
        dbManager.openDb();
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strLogin = login.getText().toString();
                String strPassword = pass.getText().toString();
                if(login.getText().toString().equals("") ||
                        pass.getText().toString().equals(""))
                    Toast.makeText(AutorizatonActivity.this, "Заполните все поля", Toast.LENGTH_SHORT).show();
                else{
                    try{
                        user = dbManager.checkUser(strLogin, strPassword);
                        Intent intent = new Intent(AutorizatonActivity.this, InfoActivity.class);
                        intent.putExtra(Users.class.getSimpleName(), user);
                        startActivity(intent);
                    }
                    catch (Exception exception){
                        Toast.makeText(AutorizatonActivity.this, "Вы ввели неправильный логин или пароль",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AutorizatonActivity.this, RegActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbManager.closeDb();
    }
}