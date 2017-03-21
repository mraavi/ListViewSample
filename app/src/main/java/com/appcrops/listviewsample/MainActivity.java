package com.appcrops.listviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] sampleArray = {"sampleListItem1", "sampleListItem2", "sampleListItem3", "sampleListItem4", "sampleListItem5", "sampleListItem6"};
        mListView = (ListView) findViewById(R.id.sample_list);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.sample_list_item, sampleArray);
        mListView.setAdapter(stringArrayAdapter);
    }
}
