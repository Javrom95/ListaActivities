package es.carlostessier.mispruebas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Javier on 11/12/2015.
 */


    public class ImplicitIntents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicitintents);
    }

    public void Google(View view) {

        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/webhp?hl=es"));
        startActivity(browser);

    }

    public void Calling(View view) {

        String number = "655398406";
        Uri call = Uri.parse("tel:" + number);
        Intent dial = new Intent(Intent.ACTION_DIAL, call);
        startActivity(Intent.createChooser(dial, "Select an app"));

    }

    public void GooMap(View view) {

        Uri position = Uri.parse("google.streetview:cbll=67.416382,32.015588");
        Intent gooMap = new Intent(Intent.ACTION_VIEW, position);
        gooMap.setPackage("com.google.android.apps.maps");
        startActivity(gooMap);

    }

    public void GooMail(View view) {
        Intent gooMail = new Intent(Intent.ACTION_SEND);
        gooMail.setType("plain/text");
        gooMail.putExtra(Intent.EXTRA_SUBJECT, "javrom95@gmail.com");
        gooMail.putExtra(Intent.EXTRA_TEXT, "Link is \n" +
                "Mensaje.");
        startActivity(Intent.createChooser(gooMail, ""));



    }

}