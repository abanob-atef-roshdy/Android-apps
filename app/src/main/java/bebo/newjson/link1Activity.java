package bebo.newjson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class link1Activity extends AppCompatActivity {
    String link;
    TextView tv1;

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link1);
        link = getIntent().getExtras().getString("link1");
        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(link);
        webView = (WebView) findViewById(R.id.webview);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
