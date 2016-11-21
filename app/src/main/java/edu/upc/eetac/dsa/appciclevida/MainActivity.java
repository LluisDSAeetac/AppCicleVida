package edu.upc.eetac.dsa.appciclevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        int e = 1;
        Log.d(tag, "Event a onCreate()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "Event a onStart()");
    }

    public void onRestart() {
        super.onRestart();
        Log.d(tag, "Event a onRestart()");
    }

    public void onResume() {
        super.onResume();
        Log.d(tag, "Event a onResume()");
    }

    public void onPause() {
        super.onPause();
        Log.d(tag, "Event a onPause()");
    }

    public void onStop() {
        super.onStop();
        Log.d(tag, "Event a onStop()");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Event a onDestroy()");
    }

}
