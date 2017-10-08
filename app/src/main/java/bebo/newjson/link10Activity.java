package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link10Activity extends AppCompatActivity {
    String link;
    TextView tv10;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link10);
        link = getIntent().getExtras().getString("link10");
        tv10 = (TextView) findViewById(R.id.tv10);
        tv10.setText(link);
        webView = (WebView) findViewById(R.id.webview9);

        webView.loadUrl(link);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
