package es.carlostessier.mispruebas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Javier on 24/11/2015.
 */
public class Intent2Act extends AppCompatActivity {

    TextView text;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent2act);
        text = (TextView) findViewById (R.id.intent2receiver);

        Bundle bund = getIntent().getExtras();
        str=bund.getString("Nombre");
        text.setText("Hola "+str+".");
    }

}
