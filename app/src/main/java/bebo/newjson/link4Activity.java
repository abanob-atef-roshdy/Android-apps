package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link4Activity extends AppCompatActivity {
String link;
    TextView tv4;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link4);
        link = getIntent().getExtras().getString("link4");
        tv4 = (TextView) findViewById(R.id.tv4);
        tv4.setText(link);
        webView = (WebView) findViewById(R.id.webview3);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
