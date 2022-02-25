package com.example.myapplication;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView= (WebView) findViewById(R.id.webid);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.instagram.com/");
    }
}