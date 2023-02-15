package com.example.applicationbusticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание объекта сущности железнодорожного билета
    BusTicket busTicket = new BusTicket("Горно-Алтайск", "Артыбаш",
            5, 9, 11, "7.00 1 июня",
            "4 часа 30 минут", 49, 70, 35);

    // создание дополнительных полей для вывода на экран полученных значений
    private TextView busTicketOut; // поле вывода информации о билете

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        busTicketOut = findViewById(R.id.busTicketOut); // вывод информации о билете

        // заполнение экрана
        busTicketOut.setText(busTicket.toString());
    }
}