package com.example.bhakoo.letusc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.view.View;

public class ListItemActivity1 extends AppCompatActivity {
    ListView listView1,listview2,listview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item1);

        listView1 = (ListView) findViewById(R.id.list1);
        String[] values = new String[]{"1.1 Intro to C++", "1.2 Advantages & Disadvantages"
        };

        listview2=(ListView) findViewById(R.id.list2);
        listview3=(ListView) findViewById(R.id.list6);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1_1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1_2.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==2){
                    Intent myIntent= new Intent(view.getContext(),ListItemActivity3_1.class);
                    startActivityForResult(myIntent,0);
                }


            }
        });
    }
}
