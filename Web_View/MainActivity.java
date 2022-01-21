package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://en.wikipedia.org/wiki/Virat_Kohli");
        myWebView.getSettings().setJavaScriptEnabled(true);

        //String unencodedHtml = "<html><body> '%23' is the code for '#' "

    }
}
