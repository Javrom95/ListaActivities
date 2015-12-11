package es.carlostessier.mispruebas;

/**
 * Created by Javier on 11/12/2015.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonPressing extends AppCompatActivity {

    Button button;
    Byte cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cont=0;
        if (savedInstanceState!=null){
            cont= savedInstanceState.getByte("IDCONT");
        }
        setContentView(R.layout.buttonpressing);
        button = (Button) findViewById(R.id.button);
        if(cont>0){
            button.setText("Pulsado "+cont+" veces.");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putByte("IDCONT", cont);
    }

    public void Pulsar(View view){
        cont++;
        if(cont>0){
            button.setText("Pulsado "+cont+" veces.");
        }
    }
}
