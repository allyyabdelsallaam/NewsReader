package com.example.lenovo.newsreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TheArticle extends AppCompatActivity {

    WebView articalWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_article);

        articalWebView = (WebView) findViewById(R.id.articleWebView);
        articalWebView.getSettings().setJavaScriptEnabled(true);
        articalWebView.setWebViewClient(new WebViewClient());

        Intent i = getIntent();
        String url = i.getStringExtra("articlesUrl");
        String content = i.getStringExtra("content");

        articalWebView.loadUrl(url);
        //articalWebView.loadData(content , "text/html" , "UTF-8");

    }
}
