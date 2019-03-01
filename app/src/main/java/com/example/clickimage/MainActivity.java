package com.example.clickimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private ImageView fb;
        private TextView text;
        private ImageView Android;
        private  TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fb = (ImageView)findViewById(R.id.imageViewId);
        text= (TextView)findViewById(R.id.textViewId);
        Android=(ImageView)findViewById(R.id.imageView2);
        text1=(TextView)findViewById(R.id.textView2) ;

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("login");
            }
        });

        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("hello");
            }
        });




    }
}
