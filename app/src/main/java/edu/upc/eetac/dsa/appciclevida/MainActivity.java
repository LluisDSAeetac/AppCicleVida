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
        Log.d(tag, "Event a onCreate()");
    }

   // completeu la resta de mètodes (onStart, onResume, ...) afegint logs ( Log.d( ... )  )
    
}
