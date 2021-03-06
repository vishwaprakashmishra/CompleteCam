package com.example.android.completecam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(stringFromJNI());
    }
    TextView camera = (TextView) findViewById(R.id.camera_text_view);
    String message = camera.getText().toString();

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    public void openCamera(View view){
        // Open activity
        // Do the camera functioinality
        // etc.
    }
    public void openStream(View view){
        //  Open functionality for stream
        // Do the config for stream
        // Open activity handling streaming
        // etc
    }
}
