package com.example.phonedialer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed1 = findViewById(R.id.ed1);
        Button b1 = findViewById(R.id.call);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = ed1.getText().toString();
                Intent it = new Intent(Intent.ACTION_DIAL);
                it.setData(Uri.parse("tel:" + num));
                startActivity(it);
            }
        });
    }
}
