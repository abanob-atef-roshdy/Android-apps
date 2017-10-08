package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link7Activity extends AppCompatActivity {
    String link;
    TextView tv7;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link7);
        link = getIntent().getExtras().getString("link7");
        tv7 = (TextView) findViewById(R.id.tv7);
        tv7.setText(link);
        webView = (WebView) findViewById(R.id.webview6);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
