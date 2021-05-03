package id.web.ardhi.ci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etInput;
    static String TEXT_INPUT = "text_input";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.etInput);
    }

    public void setSubmitBtnClick(View view){
        String textInput = etInput.getText().toString();
        Intent intent = new Intent(this, ActivityResult.class);
        intent.putExtra(TEXT_INPUT, textInput);
        startActivity(intent);
    }
}