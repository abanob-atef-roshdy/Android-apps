package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class link1Activity extends AppCompatActivity {
    String link;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link1);
        link = getIntent().getExtras().getString("link1");
        tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText(link);
    }
}
