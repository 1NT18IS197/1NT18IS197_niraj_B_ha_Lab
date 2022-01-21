package com.example.imgswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 Button b1;
 ImageView iv;
 boolean flag;
 int i=0;
 int images[]={R.drawable.imhg,R.drawable.lep,R.drawable.pups};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.img1);
        b1=(Button) findViewById(R.id.button);
        flag=true;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setImageResource(images[i]);
                i++;
                if(i==3)
                    i=0;
            }
        });
    }
}
