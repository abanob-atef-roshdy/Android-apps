package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link6Activity extends AppCompatActivity {
    String link;
    TextView tv6;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link6);
        link = getIntent().getExtras().getString("link6");
        tv6 = (TextView) findViewById(R.id.tv6);
        tv6.setText(link);
        webView = (WebView) findViewById(R.id.webview5);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
