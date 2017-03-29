package jv.roundemlon.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;

    int flag1=0;
    int flag2=0;
    int flag3=0;

    int count1=0;
    int count2=0;
    int count3=0;

    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (CheckBox)findViewById(R.id.ch1);
        ch2 = (CheckBox)findViewById(R.id.ch2);
        ch3 = (CheckBox)findViewById(R.id.ch3);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                ch2.setChecked(false);
//                ch3.setChecked(false);

                count1++;

                if(count1%2==0){
                    flag1=0;
                }else{
                    flag1=1;
                }

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

//                ch1.setChecked(false);
//                ch3.setChecked(false);

                count2++;

                if(count2%2==0){
                    flag2=0;
                }else{
                    flag2=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 2 checked: ")
                        .append(ch2.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ch1.setChecked(false);
//                ch2.setChecked(false);


                count3++;

                if(count3%2==0){
                    flag3=0;
                }else{
                    flag3=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 2 checked: ")
                        .append(ch3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();


            }
        });


        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String f1 = String.valueOf(flag1);
                String f2 = String.valueOf(flag2);
                String f3 = String.valueOf(flag3);


                Intent waitIntent = new Intent(MainActivity.this,Wait.class);
                waitIntent.putExtra("a",f1);
                waitIntent.putExtra("b",f2);
                waitIntent.putExtra("c",f3);
                startActivity(waitIntent);
            }
        });


    }

}
