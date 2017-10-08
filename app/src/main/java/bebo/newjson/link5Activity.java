package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link5Activity extends AppCompatActivity {
String link;
    TextView tv5;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link5);
        link = getIntent().getExtras().getString("link5");
        tv5 = (TextView) findViewById(R.id.tv5);
        tv5.setText(link);
        webView = (WebView) findViewById(R.id.webview4);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
