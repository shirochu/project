package com.teamawesome.projectq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ictBtn = (Button)findViewById(R.id.ictBtn);
        ictBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), HBOICT.class);
                // show how to pass information to another activity
                startActivity(startIntent);
            }
        });

    }
}
