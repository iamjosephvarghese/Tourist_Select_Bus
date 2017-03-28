package jv.roundemlon.tourist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1;
    CheckBox ch2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (CheckBox)findViewById(R.id.ch1);
        ch2 = (CheckBox)findViewById(R.id.ch2);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ch2.setChecked(false);

                StringBuffer result = new StringBuffer();
                result.append(" 1 checked: ")
                        .append(ch1.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ch1.setChecked(false);

                StringBuffer result = new StringBuffer();
                result.append(" 2 checked: ")
                        .append(ch1.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });


    }

}
