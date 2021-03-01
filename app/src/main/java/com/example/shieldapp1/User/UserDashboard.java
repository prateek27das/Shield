package com.example.shieldapp1.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.shieldapp1.LocationOwner.Barisal;
import com.example.shieldapp1.LocationOwner.Chittagong;
import com.example.shieldapp1.LocationOwner.Dinajpur;
import com.example.shieldapp1.LocationOwner.Jessore;
import com.example.shieldapp1.LocationOwner.Sylhet;
import com.example.shieldapp1.LocationOwner.comilla;
import com.example.shieldapp1.LocationOwner.dhaka;
import com.example.shieldapp1.LocationOwner.raj;

import com.example.shieldapp1.R;



public class UserDashboard extends AppCompatActivity implements  View.OnClickListener {

    private CardView card1,card2,card3,card4,card5,card6,card7,card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);



        card2 = (CardView) findViewById(R.id.l2);
        card1 = (CardView) findViewById(R.id.l1);
        card3 = (CardView) findViewById(R.id.l3);
        card4 = (CardView) findViewById(R.id.l4);
        card5 = (CardView) findViewById(R.id.l5);
        card6 = (CardView) findViewById(R.id.l6);
        card7 = (CardView) findViewById(R.id.l7);
        card8 = (CardView) findViewById(R.id.l8);




        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.l1 : i = new Intent(this, dhaka.class);startActivity(i);break;

            case R.id.l2 : i = new Intent(this, Chittagong.class);startActivity(i);break;

            case R.id.l3 : i = new Intent(this, raj.class);startActivity(i);break;

            case R.id.l4 : i = new Intent(this, comilla.class);startActivity(i);break;

            case R.id.l5 : i = new Intent(this, Jessore.class);startActivity(i);break;

            case R.id.l6 : i = new Intent(this, Sylhet.class);startActivity(i);break;

            case R.id.l7 : i = new Intent(this, Dinajpur.class);startActivity(i);break;

            case R.id.l8 : i = new Intent(this, Barisal.class);startActivity(i);break;




        }

    }
}