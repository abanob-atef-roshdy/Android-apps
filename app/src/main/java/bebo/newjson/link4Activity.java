package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class link4Activity extends AppCompatActivity {
String link;
    TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link4);
        link = getIntent().getExtras().getString("link4");
        tv4 = (TextView) findViewById(R.id.tv4);
        tv4.setText(link);
    }
}
