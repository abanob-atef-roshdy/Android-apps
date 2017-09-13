package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class link2Activity extends AppCompatActivity {
    String link2;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link2);
        link2 = getIntent().getExtras().getString("link2");
        tv2 = (TextView) findViewById(R.id.textView);
        tv2.setText(link2);
    }
}
