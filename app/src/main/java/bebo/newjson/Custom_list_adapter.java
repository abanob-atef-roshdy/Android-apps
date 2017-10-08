package bebo.newjson;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bebo on 05/10/2017.
 */

public class Custom_list_adapter extends ArrayAdapter<Newsclass> {
    Context context;
    int resource;
    ArrayList<Newsclass> news;
    public Custom_list_adapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Newsclass> news) {
        super(context, resource, news);
        this.context = context;
        this.resource = resource;
        this.news = news;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout,null,true);
        }
        Newsclass newsclass = getItem(position);
        TextView textView = (TextView) convertView.findViewById(R.id.tvnews);
        textView.setText(newsclass.getTitle());
        return convertView;
    }
}
