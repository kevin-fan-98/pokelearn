package com.example.infs3634_group23;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity {

    private static final String TAG = "YoutubeActivity";
    YouTubePlayerView ytPlayer;
    TextView ytTitle;
    TextView ytDesc;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        Log.d(TAG, "onCreate: Starting");

        // link to xml resources
        ytPlayer = (YouTubePlayerView)findViewById(R.id.ytPlayer);
        ytTitle = (TextView)findViewById(R.id.ytTitle);
        ytDesc = (TextView)findViewById(R.id.ytDesc);



        //Used to retrieve intent
        Intent intent = getIntent();
        int videoID = intent.getExtras().getInt("examplesMap");
        Log.d(TAG, "onCreate: intent data retrieved");
        Content learnContent = LearnDB.getVideoById(videoID);
        final String video = learnContent.getYoutubeVideo();
        final String title = learnContent.getTopic();
        final String description = learnContent.getVideoDescription();


        // Used to initialise the listener
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onCreate: Done initialising");
                youTubePlayer.loadVideo(video);
                ytTitle.setText(title);
                ytDesc.setText(description);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onCreate: Failed to initialise");
            }
        };
        Log.d(TAG, "onCreate: Initialising YouTube Player");
        ytPlayer.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);


    }
}
