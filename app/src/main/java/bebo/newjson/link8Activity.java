package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link8Activity extends AppCompatActivity {
    String link;
    TextView tv8;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link8);
        link = getIntent().getExtras().getString("link8");
        tv8 = (TextView) findViewById(R.id.tv8);
        tv8.setText(link);
        webView = (WebView) findViewById(R.id.webview7);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
