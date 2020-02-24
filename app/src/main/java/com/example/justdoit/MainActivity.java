package com.example.justdoit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextClock;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        final CheckBox checkBoxTint = (CheckBox)findViewById(R.id.checkBxtint);
        final CheckBox checkBoxResize = (CheckBox)findViewById(R.id.checkBxresize);
        final CheckBox checkBoxTransparency = (CheckBox)findViewById(R.id.checkBxtranspatency);
        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGrp);
        final RadioButton radioBtnMiass = (RadioButton)findViewById(R.id.radioBtnmiass);
        final RadioButton radioBtnMosc = (RadioButton)findViewById(R.id.radioBtnmoscow);
        final RadioButton radioBtnChelb = (RadioButton)findViewById(R.id.radioBtnchelyabinsk);
        final RadioButton radioBtnEkb = (RadioButton)findViewById(R.id.radioBtnekaterinburg);
        final TextView gettxtView = (TextView)findViewById(R.id.gettxtView);
        final EditText editText = (EditText)findViewById(R.id.editTxt);
        final Button btnsend = (Button)findViewById(R.id.btnsend);
        final TextClock textClock = (TextClock)findViewById(R.id.textClock);

        checkBoxTint.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });
    }
}
