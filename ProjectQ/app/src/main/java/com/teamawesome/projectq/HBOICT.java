package com.teamawesome.projectq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HBOICT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hboict);

        Button navBusiness = (Button) findViewById(R.id.busBTN);
        Button navITSM = (Button) findViewById(R.id.itsmBtn);
        Button navSE = (Button) findViewById(R.id.seBtn);

        // functie knop Business
        navBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(HBOICT.this, Business.class);
                startActivity(intent1);
            }
        });

        // functie knop ITSM
        navITSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(HBOICT.this, ITSM.class);
                startActivity(intent2);
            }
        });

        // functie knop SE
        navSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(HBOICT.this, SoftwareEngineering.class);
                startActivity(intent3);
            }
        });
    }
}
