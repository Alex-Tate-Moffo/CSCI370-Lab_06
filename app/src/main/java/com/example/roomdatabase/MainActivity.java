package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.roomdatabase.database.LabDatabase;

public class MainActivity extends AppCompatActivity {

    private Button button_addPerson;
    private Button button_getAll;
    private LabDatabase labDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labDB = Room.databaseBuilder(this, LabDatabase.class, "DATABASE_NAME")
                .build();

        button_addPerson = findViewById(R.id.add_person_button);
        button_addPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Added Person", Toast.LENGTH_SHORT).show();
            }
        });

        button_getAll = findViewById(R.id.get_all_persons_button);
        button_getAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "View All People", Toast.LENGTH_SHORT).show();
            }
        });
    }
}