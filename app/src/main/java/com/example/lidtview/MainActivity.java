package com.example.lidtview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String msg;
    private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] languages = { "Android","Java","Php","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails","C"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.languages01);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, languages);
        mListView.setAdapter(aAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),languages[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}

