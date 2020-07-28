package com.example.infs3634_group23;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Map;


public class YoutubeLandingPage extends AppCompatActivity {

    private static final String TAG = "YoutubeLandingPage";
    ListView ytListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_landing_page);
        Log.d(TAG, "onCreate: Starting");

        //link to xml resources
        ytListView = (ListView) findViewById(R.id.ytListView);


        // Add the data to youtube arraylist
        ArrayList<Content> vMap = new ArrayList<>();
        for (Map.Entry<Integer, Content> e : LearnDB.youtubeMap.entrySet()) {
            vMap.add(e.getValue());
            Log.d(TAG, "onCreate: items added to examplesMap");

            // add data to ArrayAdapter
            final ArrayAdapter<Content> vAdaptor = new ArrayAdapter<>(this, R.layout.learn_text_view, vMap);
            ytListView.setAdapter(vAdaptor);
            Log.d(TAG, "onCreate: added to examplesMap arrayAdapter ");

            ytListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Log.d(TAG, "onCreate: listView clicked");
                    Content learnContent = (Content) ytListView.getItemAtPosition(position);
                    int myPosition = learnContent.getId();
                    Intent intent = new Intent(YoutubeLandingPage.this, YoutubeActivity.class);
                    intent.putExtra("examplesMap", myPosition);
                    startActivity(intent);
                    Log.d(TAG, "onCreate: intent launched");

                }
            });


        }
    }
}
