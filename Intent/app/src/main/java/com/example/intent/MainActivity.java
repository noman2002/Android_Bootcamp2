package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuring the manifest

        //What is Activity

        //
        Button msend = findViewById(R.id.send);

        msend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"Message");
                startActivity(intent);
            }
        });


        // Uri webpage = Uri.parse(url);
        //
        //    Create a new Intent with Intent.ACTION_VIEW as the action and the URI as the data:
        //
        //Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        //
        //
        // if (intent.resolveActivity(getPackageManager()) != null) {
        //}
        //
        //startActivity(intent);
        //
        //} else {
        //   Log.d("ImplicitIntents", "Can't handle this!");
        //}

        // for location
        // public void openLocation(View view) {
        //   // Get the string indicating a location. Input is not validated; it is
        //   // passed to the location handler intact.
        //   String loc = mLocationEditText.getText().toString();
        //
        //   // Parse the location and create the intent.
        //   Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        //   Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        //
        //   // Find an activity to handle the intent, and start that activity.
        //   if (intent.resolveActivity(getPackageManager()) != null) {
        //       startActivity(intent);
        //   } else {
        //       Log.d("ImplicitIntents", "Can't handle this intent!");
        //   }
        //}
        //
        //
        //public void shareText(View view) {
        //        String txt = mShareTextEditText.getText().toString();
        //        String mimeType = "text/plain";
        //        ShareCompat.IntentBuilder
        //                        .from(this)
        //                        .setType(mimeType)
        //                        .setChooserTitle(R.string.share_text_with)
        //                        .setText(txt)
        //                        .startChooser();
        //}
    }
}
