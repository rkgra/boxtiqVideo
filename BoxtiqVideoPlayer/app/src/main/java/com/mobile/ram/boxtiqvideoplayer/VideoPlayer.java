package com.mobile.ram.boxtiqvideoplayer;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoPlayer extends AppCompatActivity

{


    VideoView myVideoView;
    String urlStream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        urlStream = "http://d1qcwlrtxjuuxx.cloudfront.net/uploads/283/playlist_master.m3u8";

        myVideoView = (VideoView) this.findViewById(R.id.video_view);
        MediaController mc = new MediaController(this);
        myVideoView.setMediaController(mc);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myVideoView.setVideoURI(Uri.parse(urlStream));
            }
        });
    }
}