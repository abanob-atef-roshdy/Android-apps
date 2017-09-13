package bebo.newjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class link9Activity extends AppCompatActivity {
    String link;
    TextView tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link9);
        link = getIntent().getExtras().getString("link9");
        tv9 = (TextView) findViewById(R.id.tv9);
        tv9.setText(link);
    }
}
