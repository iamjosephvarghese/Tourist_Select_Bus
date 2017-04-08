package jv.roundemlon.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by Joseph on 30/03/17.
 */


public class MainActivity extends AppCompatActivity {
    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    CheckBox ch4;
    CheckBox ch5;
    CheckBox ch6;
    CheckBox ch7;
    CheckBox ch8;
    CheckBox ch9;
    CheckBox ch10;
    CheckBox ch11;
    CheckBox ch12;
    CheckBox ch13;
    CheckBox ch14;

    int flag1=0;
    int flag2=0;
    int flag3=0;
    int flag4=0;
    int flag5=0;
    int flag6=0;
    int flag7=0;
    int flag8=0;
    int flag9=0;
    int flag10=0;
    int flag11=0;
    int flag12=0;
    int flag13=0;
    int flag14=0;

    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;
    int count7=0;
    int count8=0;
    int count9=0;
    int count10=0;
    int count11=0;
    int count12=0;
    int count13=0;
    int count14=0;

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
        ch7 = (CheckBox)findViewById(R.id.ch7);
        ch8 = (CheckBox)findViewById(R.id.ch8);
        ch9 = (CheckBox)findViewById(R.id.ch9);
        ch10 = (CheckBox)findViewById(R.id.ch10);
        ch11 = (CheckBox)findViewById(R.id.ch11);
        ch12 = (CheckBox)findViewById(R.id.ch12);
        ch13 = (CheckBox)findViewById(R.id.ch13);
        ch14 = (CheckBox)findViewById(R.id.ch14);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count1++;

                if(count1%2==0){
                    flag1=0;
                }else{
                    flag1=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 1 checked: ")
                        .append(ch1.isChecked());

            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                count2++;

                if(count2%2==0){
                    flag2=0;
                }else{
                    flag2=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 2 checked: ")
                        .append(ch2.isChecked());

            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                count3++;

                if(count3%2==0){
                    flag3=0;
                }else{
                    flag3=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 3 checked: ")
                        .append(ch3.isChecked());



            }
        });



        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count4++;

                if(count4%2==0){
                    flag4=0;
                }else{
                    flag4=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 4 checked: ")
                        .append(ch4.isChecked());


            }
        });



        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count5++;

                if(count5%2==0){
                    flag5=0;
                }else{
                    flag5=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 5 checked: ")
                        .append(ch5.isChecked());

            }
        });



        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count6++;

                if(count6%2==0){
                    flag6=0;
                }else{
                    flag6=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 6 checked: ")
                        .append(ch6.isChecked());



            }
        });



        ch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count7++;

                if(count7%2==0){
                    flag7=0;
                }else{
                    flag7=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 7 checked: ")
                        .append(ch7.isChecked());



            }
        });



        ch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                count8++;

                if(count8%2==0){
                    flag8=0;
                }else{
                    flag8=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 8checked: ")
                        .append(ch8.isChecked());


            }
        });



        ch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count9++;

                if(count9%2==0){
                    flag9=0;
                }else{
                    flag9=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 9 checked: ")
                        .append(ch9.isChecked());



            }
        });



        ch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                count10++;

                if(count10%2==0){
                    flag10=0;
                }else{
                    flag10=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 10 checked: ")
                        .append(ch10.isChecked());


            }
        });


        ch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                count11++;

                if(count11%2==0){
                    flag11=0;
                }else{
                    flag11=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 11 checked: ")
                        .append(ch11.isChecked());


            }
        });

        

        ch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                count12++;

                if(count12%2==0){
                    flag12=0;
                }else{
                    flag12=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 12 checked: ")
                        .append(ch12.isChecked());


            }
        });

        ch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                count13++;

                if(count13%2==0){
                    flag6=0;
                }else{
                    flag13=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 13 checked: ")
                        .append(ch13.isChecked());


            }
        });

        ch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                count14++;

                if(count14%2==0){
                    flag14=0;
                }else{
                    flag14=1;
                }

                StringBuffer result = new StringBuffer();
                result.append(" 14 checked: ")
                        .append(ch14.isChecked());



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
                String f7 = String.valueOf(flag7);
                String f8 = String.valueOf(flag8);
                String f9 = String.valueOf(flag9);
                String f10 = String.valueOf(flag10);
                String f11 = String.valueOf(flag11);
                String f12 = String.valueOf(flag12);
                String f13 = String.valueOf(flag13);
                String f14= String.valueOf(flag14);




                Intent waitIntent = new Intent(MainActivity.this,Wait.class);
                waitIntent.putExtra("1",f1);
                waitIntent.putExtra("2",f2);
                waitIntent.putExtra("3",f3);
                waitIntent.putExtra("4",f4);
                waitIntent.putExtra("5",f5);
                waitIntent.putExtra("6",f6);
                waitIntent.putExtra("7",f7);
                waitIntent.putExtra("8",f8);
                waitIntent.putExtra("9",f9);
                waitIntent.putExtra("10",f10);
                waitIntent.putExtra("11",f11);
                waitIntent.putExtra("12",f12);
                waitIntent.putExtra("13",f13);
                waitIntent.putExtra("14",f14);

                startActivity(waitIntent);
                finish();
            }
        });


    }

}
