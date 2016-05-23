package com.estsoft.widget02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById( R.id.toggleButton ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isChecked = ( ( ToggleButton ) v).isChecked();
                ((TextView) findViewById( R.id.textView )).setText( isChecked ? "켜짐" : "꺼짐" );

            }
        });

        findViewById( R.id.checkBox ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = (CheckBox ) v;
                cb.setText( cb.isChecked() ? "checked" : "unchecked" );
            }
        });

        RadioGroup rg = (RadioGroup)findViewById( R.id.radioGroupGender );
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch( checkedId ) {
                    case R.id.radioButtonFemale:
                        ((TextView) findViewById( R.id.textView )).setText( "Female Checked");
                        break;
                    case R.id.radioButtonMale:
                        ((TextView) findViewById( R.id.textView )).setText( "Male Checked");
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
