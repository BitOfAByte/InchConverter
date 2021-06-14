package me.toby.cmconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editInch;
    TextView txtCm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInch = findViewById(R.id.editInch);
        txtCm = findViewById(R.id.txtCm);
    }

    public void convert(View view) {
        String inchInput = editInch.getText().toString();
        Double cm = Double.parseDouble(inchInput) * 2.54;

        txtCm.setText(inchInput + " Inch is equal to " + cm + "cm");
    }
}