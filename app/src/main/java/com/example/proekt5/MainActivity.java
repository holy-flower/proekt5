package com.example.proekt5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked (View view){
        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = findViewById(R.id.selection);
        int id = view.getId();
        if (id == R.id.java){
            if (checked){
                selection.setText("Выбрана java");
            }
        }
        else if (id == R.id.kotlin){
            if (checked){
                selection.setText("Выбран kotlin");
            }
        }
    }
}