package es.carlostessier.mispruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cicle_life);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart()", "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart()", "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume()", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause()", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop()", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i("onPause()", "onPause()");

    }
}