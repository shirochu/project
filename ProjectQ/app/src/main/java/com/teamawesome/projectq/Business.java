package com.teamawesome.projectq;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class Business extends AppCompatActivity {


    private Button mjobBTN1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);


        mjobBTN1 = (Button) findViewById(R.id.jobBTN1);

        mjobBTN1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ta2sOtfZAZg"));
                startActivity(intent1);
            }
        });
    }
}
