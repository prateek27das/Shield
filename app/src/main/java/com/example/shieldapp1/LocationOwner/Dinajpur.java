package com.example.shieldapp1.LocationOwner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.shieldapp1.R;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pusher.pushnotifications.PushNotifications;


public class Dinajpur extends AppCompatActivity {

    Button unlock;
    Button lock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinajpur);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        PushNotifications.start(getApplicationContext(), "dce41b63-324d-43ae-99d8-83b480bd483b");
        PushNotifications.addDeviceInterest("hello");

        unlock = (Button) findViewById(R.id.unlock);
        lock = (Button) findViewById(R.id.lock);

        unlock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LOCK_STATUS");
                myRef.setValue(1);
            }
        });

        lock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LOCK_STATUS");
                myRef.setValue(0);
            }
        });
    }
}