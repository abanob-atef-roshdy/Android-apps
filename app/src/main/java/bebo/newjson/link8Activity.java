package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class link8Activity extends AppCompatActivity {
    String link;
    TextView tv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link8);
        link = getIntent().getExtras().getString("link8");
        tv8 = (TextView) findViewById(R.id.tv8);
        tv8.setText(link);
    }
}