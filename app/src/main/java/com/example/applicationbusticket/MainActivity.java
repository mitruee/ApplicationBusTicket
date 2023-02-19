package com.example.applicationbusticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BusTicket busTicket = new BusTicket("Горно-Алтайск", "Артыбаш",
            5, 9, 11, "7.00 1 июня",
            "4 часа 30 минут", 49, 70, 35);

    private TextView busTicketOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busTicketOut = findViewById(R.id.busTicketOut);

        busTicketOut.setText(busTicket.toString());
    }
}
