package com.example.pmd_appcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox miCheckBox = (CheckBox) findViewById(R.id.checkBox);

        miCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean pulsado) {
                if(pulsado){
                    Toast.makeText(MainActivity.this,"Pulsado",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"DesPulsado",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}