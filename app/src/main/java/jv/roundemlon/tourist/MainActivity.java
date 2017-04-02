package jv.roundemlon.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    CheckBox ch4;
    CheckBox ch5;
    CheckBox ch6;

    int flag1=0;
    int flag2=0;
    int flag3=0;
    int flag4=0;
    int flag5=0;
    int flag6=0;

    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;

    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        ch1 = (CheckBox)findViewById(R.id.ch1);
        ch2 = (CheckBox)findViewById(R.id.ch2);
        ch3 = (CheckBox)findViewById(R.id.ch3);
        ch4 = (CheckBox)findViewById(R.id.ch4);
        ch5 = (CheckBox)findViewById(R.id.ch5);
        ch6 = (CheckBox)findViewById(R.id.ch6);

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
                        Toast.LENGTH_SHORT).show();
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
                        Toast.LENGTH_SHORT).show();

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
                result.append(" 3 checked: ")
                        .append(ch3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();


            }
        });



        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ch1.setChecked(false);
//                ch2.setChecked(false);


                count4++;

                if(count4%2==0){
                    flag4=0;
                }else{
                    flag4=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 4 checked: ")
                        .append(ch4.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();


            }
        });



        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ch1.setChecked(false);
//                ch2.setChecked(false);


                count5++;

                if(count5%2==0){
                    flag5=0;
                }else{
                    flag5=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 5 checked: ")
                        .append(ch5.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();


            }
        });



        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ch1.setChecked(false);
//                ch2.setChecked(false);


                count6++;

                if(count6%2==0){
                    flag6=0;
                }else{
                    flag6=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 6 checked: ")
                        .append(ch6.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();


            }
        });




        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String f1 = String.valueOf(flag1);
                String f2 = String.valueOf(flag2);
                String f3 = String.valueOf(flag3);
                String f4 = String.valueOf(flag4);
                String f5 = String.valueOf(flag5);
                String f6 = String.valueOf(flag6);


                Toast.makeText(MainActivity.this,f1, Toast.LENGTH_SHORT).show();


                Log.d("DEBUG","flag1:"+f1);
                Log.d("DEBUG","flag2:"+f2);
                Log.d("DEBUG","flag3:"+f3);


                Intent waitIntent = new Intent(MainActivity.this,Wait.class);
                waitIntent.putExtra("a",f1);
                waitIntent.putExtra("b",f2);
                waitIntent.putExtra("c",f3);
                waitIntent.putExtra("d",f4);
                waitIntent.putExtra("e",f5);
                waitIntent.putExtra("f",f6);
                startActivity(waitIntent);
                finish();
            }
        });


    }

}
