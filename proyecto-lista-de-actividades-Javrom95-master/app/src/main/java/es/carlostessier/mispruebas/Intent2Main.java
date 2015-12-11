package es.carlostessier.mispruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intent2Main extends AppCompatActivity {

    EditText text;
    Button button;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        text = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
    }

    public void pulsar(View view){
        Log.i("Pulsar", "Pulsar");
        str=""+text.getText().toString();
        Log.i("Pulsar", "Pulsar");
        Intent intent = new Intent(this, Intent2Act.class);
        Log.i("Pulsar", "Pulsar");
        intent.putExtra("Nombre", str);
        Log.i("Pulsar", "Pulsar");
        startActivity(intent);
        Log.i("Pulsar", "Pulsar");
    }

}

