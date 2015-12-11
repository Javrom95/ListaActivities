package es.carlostessier.mispruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Intent1Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1_main);
    }

    public void pulsar(View view){
        Intent intent = new Intent(this, Intent1Act.class);
        startActivity(intent);
    }

}
