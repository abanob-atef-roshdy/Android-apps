package bebo.newjson;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList news = new ArrayList();
    ListView listview;
    String l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         listview = (ListView) findViewById(R.id.listview);

        RequestQueue queue = Volley.newRequestQueue(this);

        String url ="https://newsapi.org/v1/articles?source=abc-news-au&sortBy=top&apiKey=efbfdaa34e1c484a8293611dcad21141";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        try {

                              final ArrayList arrayList = new ArrayList();
                          //  final ArrayList arrayList1 = new ArrayList();
                            JSONObject a1 = new JSONObject(response);
                            JSONArray a2 = a1.getJSONArray("articles");
                            for (int e = 0;e<a2.length();e++) {
                                JSONObject ob = a2.getJSONObject(e);
                              //  String title1 = ob.getString("title");
                                String title = ob.getString("url");
                            //    arrayList1.add(e,title1);
                                arrayList.add(e,title);
                                news.add(new Newsclass(ob.getString("title")));

                            }

                            Context context = getApplicationContext();

                            //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(context,android.R.layout.preference_category,arrayList1);
                            Custom_list_adapter custom_list_adapter = new Custom_list_adapter(getApplicationContext(),R.layout.custom_list_layout,news);
                            listview.setAdapter(custom_list_adapter);
                            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                @Override
                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                    switch (position){
                                        case 0 :
                                            Intent intent = new Intent(MainActivity.this,link1Activity.class);
                                            l1 = (String) arrayList.get(0);
                                            intent.putExtra("link1", l1);
                                            startActivity(intent);
                                            break;
                                        case 1 :
                                            Intent intent1 = new Intent(MainActivity.this,link2Activity.class);
                                            l2 = (String) arrayList.get(1);
                                            intent1.putExtra("link2", l2);
                                            startActivity(intent1);
                                            break;
                                        case 2 :
                                            Intent intent2 = new Intent(MainActivity.this,link3Activity.class);
                                            l3 = (String) arrayList.get(2);
                                            intent2.putExtra("link3", l3);
                                            startActivity(intent2);
                                            break;
                                        case 3 :
                                            Intent intent3 = new Intent(MainActivity.this,link4Activity.class);
                                            l4 = (String) arrayList.get(3);
                                            intent3.putExtra("link4", l4);
                                            startActivity(intent3);
                                            break;

                                        case 4 :
                                            Intent intent4 = new Intent(MainActivity.this,link5Activity.class);
                                            l5 = (String) arrayList.get(4);
                                            intent4.putExtra("link5", l5);
                                            startActivity(intent4);
                                            break;
                                        case 5 :
                                            Intent intent5 = new Intent(MainActivity.this,link6Activity.class);
                                            l6 = (String) arrayList.get(5);
                                            intent5.putExtra("link6", l6);
                                            startActivity(intent5);
                                            break;
                                        case 6 :
                                            Intent intent6 = new Intent(MainActivity.this,link7Activity.class);
                                            l7 = (String) arrayList.get(6);
                                            intent6.putExtra("link7", l7);
                                            startActivity(intent6);
                                            break;

                                        case 7 :
                                            Intent intent7 = new Intent(MainActivity.this,link8Activity.class);
                                            l8 = (String) arrayList.get(7);
                                            intent7.putExtra("link8", l8);
                                            startActivity(intent7);
                                            break;

                                        case 8 :
                                            Intent intent8 = new Intent(MainActivity.this,link9Activity.class);
                                            l9 = (String) arrayList.get(8);
                                            intent8.putExtra("link9", l9);
                                            startActivity(intent8);
                                            break;

                                        case 9 :
                                            Intent intent9 = new Intent(MainActivity.this,link10Activity.class);
                                            l10 = (String) arrayList.get(9);
                                            intent9.putExtra("link10", l10);
                                            startActivity(intent9);
                                            break;



                                    }
                                }
                            });
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d("we",error.toString());
                Toast.makeText(MainActivity.this, "a network error occured", Toast.LENGTH_SHORT).show();
            }
        });
// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}
