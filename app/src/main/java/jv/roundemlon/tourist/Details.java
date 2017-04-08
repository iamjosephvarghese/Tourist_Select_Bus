package jv.roundemlon.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Joseph on 30/03/17.
 */


public class Details extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        t3 = (TextView)findViewById(R.id.t3);
        t4 = (TextView)findViewById(R.id.t4);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("pass1");
        String start = intent.getExtras().getString("pass2");
        String end = intent.getExtras().getString("pass3");
        String price = intent.getExtras().getString("pass4");


        t1.setText(name);
        t2.setText(start);
        t3.setText(end);
        t4.setText(price);

    }
}
