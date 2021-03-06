package com.retreat.shebuel.spitraining.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.longtailvideo.jwplayer.JWPlayerView;
import com.longtailvideo.jwplayer.media.playlists.PlaylistItem;
import com.retreat.shebuel.spitraining.App;
import com.retreat.shebuel.spitraining.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class InstructionVideo extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    JWPlayerView playerView;
    String option;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_example);
        SharedPreferences sharedpreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        editor= sharedpreferences.edit();
        Locale locale = new Locale(sharedpreferences.getString("language","en"));
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        Intent intent = getIntent();
        option=intent.getStringExtra("option");

        //Define and set listener for the button
        Button b = (Button)findViewById(R.id.video_button);
        b.setText("Finish");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),MainOptionsMenu.class);
                finish();
                startActivity(i);
            }
        });
        if(option.equals("policy"))
        {
            playerView = (JWPlayerView) findViewById(R.id.playerView);
            playerView.setLicenseKey(getBaseContext(),"cyuQSoIpd0R5rrqGPrZNhcfWoT/zSJ5ZhLKIlQ==");
            playerView.setMinimumHeight(720);
            PlaylistItem item = new PlaylistItem.Builder()
                    .file("http://content.jwplatform.com/videos/oZFRM1CW-ktVFP6H3.mp4")
                    .image("http://content.jwplatform.com/thumbs/oZFRM1CW-720.jpg")
                    .description("Policies")
                    .title("Policy")
                    .build();

            // Load the PlaylistItem into the player
            playerView.load(item);
        }
        else if(option.equals("Values"))
        {
            playerView = (JWPlayerView) findViewById(R.id.playerView);
            playerView.setLicenseKey(getBaseContext(),"cyuQSoIpd0R5rrqGPrZNhcfWoT/zSJ5ZhLKIlQ==");
            playerView.setMinimumHeight(720);
            // Create a list to contain the PlaylistItems
            List<PlaylistItem> playlist = new ArrayList<>();

// Add a PlaylistItem pointing to the first piece of content
            playlist.add(new PlaylistItem("http://content.jwplatform.com/videos/JsgxU6cH-Z0OyQBih.mp4"));

// Add another PlaylistItem pointing to the second piece of content
// This time using the Builder
            playlist.add(new PlaylistItem.Builder()
                    .file("http://content.jwplatform.com/videos/P2g1CBKG-WrfPGdE7.mp4")
                    .image("http://content.jwplatform.com/thumbs/P2g1CBKG-480.jpg")
                    .description("A good TV show")
                    .build());

// Add a final piece of content
            playlist.add(new PlaylistItem("http://content.jwplatform.com/videos/KeLLPOK3-WrfPGdE7.mp4"));
            playerView.load(playlist);
        }
        else if(option.equals("facility")){
            playerView = (JWPlayerView) findViewById(R.id.playerView);
            playerView.setLicenseKey(getBaseContext(),"cyuQSoIpd0R5rrqGPrZNhcfWoT/zSJ5ZhLKIlQ==");
            playerView.setMinimumHeight(720);
            PlaylistItem item = new PlaylistItem.Builder()
                    .file("http://content.jwplatform.com/videos/oZFRM1CW-ktVFP6H3.mp4")
                    .image("http://content.jwplatform.com/thumbs/oZFRM1CW-720.jpg")
                    .description("Policies")
                    .title("Policy")
                    .build();

            // Load the PlaylistItem into the player
            playerView.load(item);
        }
        else if(option.equals("ee")){
            playerView = (JWPlayerView) findViewById(R.id.playerView);
            playerView.setLicenseKey(getBaseContext(),"cyuQSoIpd0R5rrqGPrZNhcfWoT/zSJ5ZhLKIlQ==");
            playerView.setMinimumHeight(720);
            PlaylistItem item = new PlaylistItem.Builder()
                    .file("http://content.jwplatform.com/videos/oZFRM1CW-ktVFP6H3.mp4")
                    .image("http://content.jwplatform.com/thumbs/oZFRM1CW-720.jpg")
                    .description("Policies")
                    .title("Policy")
                    .build();

            // Load the PlaylistItem into the player
            playerView.load(item);
        }
        else if(option.equals("benefits"))
        {
            playerView = (JWPlayerView) findViewById(R.id.playerView);
            playerView.setLicenseKey(getBaseContext(),"cyuQSoIpd0R5rrqGPrZNhcfWoT/zSJ5ZhLKIlQ==");
            playerView.setMinimumHeight(720);
            PlaylistItem item = new PlaylistItem.Builder()
                    .file("http://content.jwplatform.com/videos/oZFRM1CW-ktVFP6H3.mp4")
                    .image("http://content.jwplatform.com/thumbs/oZFRM1CW-720.jpg")
                    .description("Policies")
                    .title("Policy")
                    .build();

            // Load the PlaylistItem into the player
            playerView.load(item);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.profile) {
            Intent i = new Intent(getBaseContext(),Profile.class);
            startActivity(i);

        } else if (id == R.id.language) {
            Intent i = new Intent(getBaseContext(),LanguageOptions.class);
            startActivity(i);

        } else if (id == R.id.settings) {
            editor.clear();
            editor.commit();
            Intent i = new Intent(getBaseContext(),Login.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    protected void onResume() {
        // Let JW Player know that the app has returned from the background
        super.onResume();
        playerView.onResume();
        if(((App)getApplication()).isLanguageChanged())
        {
            ((App)getApplication()).setLanguageChanged(false);
            super.recreate();
        }

    }

    @Override
    protected void onPause() {
        // Let JW Player know that the app is going to the background
        playerView.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        // Let JW Player know that the app is being destroyed
        playerView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // Set fullscreen when the device is rotated to landscape
        playerView.setFullscreen(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE, true);
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Exit fullscreen when the user pressed the Back button
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (playerView.getFullscreen()) {
                playerView.setFullscreen(false, false);
                return false;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}

