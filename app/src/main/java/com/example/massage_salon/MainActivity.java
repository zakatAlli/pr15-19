package com.example.massage_salon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.massage_salon.R;
import com.example.massage_salon.data.Services;
import com.example.massage_salon.data.Users;
import com.example.massage_salon.database.DataBaseManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, AutorizatonActivity.class));
                finish();
            }
        }, 1500);

//        DataBaseManager dataBaseManager = new DataBaseManager(this);
//        dataBaseManager.openDb();
//        dataBaseManager.addService(new Services("Тайский массаж", 10000, "Очень тяжелый массаж"));
//        dataBaseManager.addService(new Services("Балийский массаж", 20000, "Массаж по азиатски массаж"));
//        dataBaseManager.addService(new Services("Аромомассаж", 35000, "Делается с помощью эфирных масел"));
//        dataBaseManager.addService(new Services("Массаж для релаксации", 11000, "Помогает снять стресс"));
//        dataBaseManager.addService(new Services("Антицеллюлитный массаж", 16000, "Выравнивает кожу и помогает немного похудеть"));
//        dataBaseManager.addService(new Services("Лимфодернажный массаж", 55000, "Эта процедура может выполняться вручную или аппаратным методом"));
//        dataBaseManager.addService(new Services("Массаж горячими камнями", 17000, "Это вид спа-процедур популярен из-за того, чтоб вызывает приятные ощущения"));
//        dataBaseManager.addService(new Services("Оздоровительный массаж", 12000, "Сочетает техники шведского и классического массажа"));
//        dataBaseManager.addService(new Services("Массаж ног", 4000, "Помогает расслабить ноги после тяжелого дня"));
//        dataBaseManager.addService(new Services("Массаж рук", 3000, "Помогает расслабить руки после тяжелого дня"));
//        dataBaseManager.addService(new Services("Массаж спины", 6500, "Помогает расслабить спину после тяжелого дня"));
//        dataBaseManager.addService(new Services("Ультразвуковая чистка лица", 2500, "Помогает очистить лицо после тяжелого дня"));
//        dataBaseManager.addService(new Services("Массаж шейно-воротниковой зоны", 2500, "Помогает расслабить шею после тяжелого дня"));
//        dataBaseManager.closeDb();
    }
}