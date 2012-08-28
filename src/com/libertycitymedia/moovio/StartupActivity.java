package com.libertycitymedia.moovio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StartupActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.startup_layout, menu);
        return true;
    }
}
