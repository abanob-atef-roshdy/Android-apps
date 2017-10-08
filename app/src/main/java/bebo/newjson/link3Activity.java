package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link3Activity extends AppCompatActivity {
String link;
    TextView tv3;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link3);
        link = getIntent().getExtras().getString("link3");
        tv3 = (TextView) findViewById(R.id.tv3);
        tv3.setText(link);
        webView = (WebView) findViewById(R.id.webview2);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
