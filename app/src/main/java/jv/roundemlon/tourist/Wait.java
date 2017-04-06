package jv.roundemlon.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Wait extends AppCompatActivity {

    int f1;
    int f2;
    int f3;
    int f4;
    int f5;
    int f6;
    int f7;
    int f8;
    int f9;
    int f10;
    int f11;
    int f12;
    int f13;
    int f14;

    EditText ed1;

    Button btn2;

//    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // Make sure user insert date into edittext in this format.
//
//    Date dateObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);

        Intent intent = getIntent();
        final String a = intent.getExtras().getString("1");
        final String b = intent.getExtras().getString("2");
        final String c = intent.getExtras().getString("3");
        final String d = intent.getExtras().getString("4");
        final String e = intent.getExtras().getString("5");
        final String f = intent.getExtras().getString("6");
        final String g = intent.getExtras().getString("7");
        final String h = intent.getExtras().getString("8");
        final String i = intent.getExtras().getString("9");
        final String j = intent.getExtras().getString("10");
        final String k = intent.getExtras().getString("11");
        final String l = intent.getExtras().getString("12");
        final String m = intent.getExtras().getString("13");
        final String n = intent.getExtras().getString("14");


        f1 = Integer.parseInt(a);
        f2 = Integer.parseInt(b);
        f3 = Integer.parseInt(c);
        f4 = Integer.parseInt(d);
        f5 = Integer.parseInt(e);
        f6 = Integer.parseInt(f);
        f7 = Integer.parseInt(g);
        f8 = Integer.parseInt(h);
        f9 = Integer.parseInt(i);
        f10 = Integer.parseInt(j);
        f11 = Integer.parseInt(k);
        f12 = Integer.parseInt(l);
        f13 = Integer.parseInt(m);
        f14 = Integer.parseInt(n);

        Toast.makeText(this,a, Toast.LENGTH_SHORT).show();

        ed1 = (EditText)findViewById(R.id.ed1);


//        edStart = (EditText)findViewById(R.id.edStart);
//        edEnd = (EditText)findViewById(R.id.edEnd);


        btn2 = (Button)findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wait1 = ed1.getText().toString();




                //String start = edStart.getText().toString();
               // String end = edEnd.getText().toString();

//                Toast.makeText(Wait.this,wait1+wait2+wait3, Toast.LENGTH_SHORT).show();

                Intent listIntent = new Intent(Wait.this,BusList.class);
                listIntent.putExtra("a",wait1);
//                listIntent.putExtra("b",wait2);
//                listIntent.putExtra("c",wait3);
//                listIntent.putExtra("d",wait4);
//                listIntent.putExtra("e",wait5);
//                listIntent.putExtra("f",wait6);
               // listIntent.putExtra("g",start);
               // listIntent.putExtra("h",end);
                listIntent.putExtra("i",a);
                listIntent.putExtra("j",b);
                listIntent.putExtra("k",c);
                listIntent.putExtra("l",d);
                listIntent.putExtra("m",e);
                listIntent.putExtra("n",f);
                listIntent.putExtra("o",a);
                listIntent.putExtra("p",b);
                listIntent.putExtra("q",c);
                listIntent.putExtra("r",d);
                listIntent.putExtra("s",e);
                listIntent.putExtra("t",f);
                listIntent.putExtra("u",e);
                listIntent.putExtra("v",f);
                startActivity(listIntent);



            }
        });





    }
}
