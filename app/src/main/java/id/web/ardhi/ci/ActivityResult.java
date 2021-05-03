package id.web.ardhi.ci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {
    static String TEXT_INPUT = "text_input";
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();
        String textInput = intent.getStringExtra(TEXT_INPUT);
        tvResult.setText(textInput);
    }

}