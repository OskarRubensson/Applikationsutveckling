package se.osru1900.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mainText;
    Button refreshButton;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = findViewById(R.id.textViewMain);
        refreshButton = findViewById(R.id.buttonRefresh);
        refreshButton.setOnClickListener(view -> {
            counter++;
            mainText.setText("Counter: " + counter);
        });
    }

    public void refreshClick(){
        counter++;
        mainText.setText(counter);
    }
}