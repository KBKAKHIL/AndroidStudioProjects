package com.contact.indra.mycontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.b1);
        Button b2=(Button)findViewById(R.id.b2);
        Button b3=(Button)findViewById(R.id.b3);
        Button b4=(Button)findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Main5Activity.class);
                startActivity(in);
            }
        });
    }
}
