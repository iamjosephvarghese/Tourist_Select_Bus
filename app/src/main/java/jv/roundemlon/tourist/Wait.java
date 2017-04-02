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

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;
    EditText edStart;
    EditText edEnd;

    Button btn2;

//    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // Make sure user insert date into edittext in this format.
//
//    Date dateObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);

        Intent intent = getIntent();
        final String a = intent.getExtras().getString("a");
        final String b = intent.getExtras().getString("b");
        final String c = intent.getExtras().getString("c");
        final String d = intent.getExtras().getString("d");
        final String e = intent.getExtras().getString("e");
        final String f = intent.getExtras().getString("f");

        f1 = Integer.parseInt(a);
        f2 = Integer.parseInt(b);
        f3 = Integer.parseInt(c);
        f4 = Integer.parseInt(d);
        f5 = Integer.parseInt(e);
        f6 = Integer.parseInt(f);

        Toast.makeText(this,a, Toast.LENGTH_SHORT).show();

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
        ed3 = (EditText)findViewById(R.id.ed3);
        ed4 = (EditText)findViewById(R.id.ed4);
        ed5 = (EditText)findViewById(R.id.ed5);
        ed6 = (EditText)findViewById(R.id.ed6);

//        edStart = (EditText)findViewById(R.id.edStart);
//        edEnd = (EditText)findViewById(R.id.edEnd);


        btn2 = (Button)findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wait1 = ed1.getText().toString();

                String wait2 = ed2.getText().toString();

                String wait3 = ed3.getText().toString();

                String wait4 = ed4.getText().toString();

                String wait5 = ed5.getText().toString();

                String wait6 = ed6.getText().toString();


                //String start = edStart.getText().toString();
               // String end = edEnd.getText().toString();

                Toast.makeText(Wait.this,wait1+wait2+wait3, Toast.LENGTH_SHORT).show();

                Intent listIntent = new Intent(Wait.this,BusList.class);
                listIntent.putExtra("a",wait1);
                listIntent.putExtra("b",wait2);
                listIntent.putExtra("c",wait3);
                listIntent.putExtra("d",wait4);
                listIntent.putExtra("e",wait5);
                listIntent.putExtra("f",wait6);
               // listIntent.putExtra("g",start);
               // listIntent.putExtra("h",end);
                listIntent.putExtra("i",a);
                listIntent.putExtra("j",b);
                listIntent.putExtra("k",c);
                listIntent.putExtra("l",d);
                listIntent.putExtra("m",e);
                listIntent.putExtra("n",f);
                startActivity(listIntent);



            }
        });





    }
}
