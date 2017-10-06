package com.teamawesome.projectq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ITSM extends AppCompatActivity {

        private WebView mWebView;
        private Button mjobBTN1;
        private Button mjobBTN2;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_itsm);

            mjobBTN1 = (Button) findViewById(R.id.jobBTN1);

            mjobBTN1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oqGWP1YG7QA"));
                    startActivity(intent1);
                }
            });
            mjobBTN2 = (Button) findViewById(R.id.jobBTN2);

            mjobBTN2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_dAomtQ9Oxg"));
                    startActivity(intent2);
                }
            });
        }
    }
