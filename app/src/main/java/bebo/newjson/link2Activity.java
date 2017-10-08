package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class link2Activity extends AppCompatActivity {
    String link2;
    TextView tv2;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link2);
        link2 = getIntent().getExtras().getString("link2");
        tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText(link2);
        webView = (WebView) findViewById(R.id.webview1);
        //tv1.setVisibility(View.INVISIBLE);
        webView.loadUrl(link2);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
