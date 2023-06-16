package org.pytorch.demo.objectdetection;
import android.os.Bundle;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class infoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cats);

        // Add your activity code here

        // Get a reference to the ScrollView
        ScrollView scrollView = findViewById(R.id.scrollView);

        // Optionally, you can scroll to a specific position within the ScrollView
        // scrollView.scrollTo(x, y);

        // If you want to programmatically scroll to the top of the ScrollView, you can use:
        // scrollView.smoothScrollTo(0, 0);
    }
}
