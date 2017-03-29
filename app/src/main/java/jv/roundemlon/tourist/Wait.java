package jv.roundemlon.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Wait extends AppCompatActivity {

    int f1;
    int f2;
    int f3;

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;

    Button btn2;

    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // Make sure user insert date into edittext in this format.

    Date dateObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);

        Intent intent = getIntent();
        String a = intent.getExtras().getString("a");
        String b = intent.getExtras().getString("b");
        String c = intent.getExtras().getString("c");

        f1 = Integer.parseInt(a);
        f2 = Integer.parseInt(b);
        f3 = Integer.parseInt(c);

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
        ed3 = (EditText)findViewById(R.id.ed3);
        ed4 = (EditText)findViewById(R.id.ed4);
        ed5 = (EditText)findViewById(R.id.ed5);
        ed6 = (EditText)findViewById(R.id.ed6);


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


                Toast.makeText(Wait.this,wait1+wait2+wait3, Toast.LENGTH_SHORT).show();

                Intent listIntent = new Intent(Wait.this,BusList.class);
                listIntent.putExtra("a",wait1);
                listIntent.putExtra("b",wait2);
                listIntent.putExtra("c",wait3);
                startActivity(listIntent);



            }
        });





    }
}
