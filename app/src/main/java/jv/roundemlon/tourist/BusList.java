package jv.roundemlon.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Date;

public class BusList extends AppCompatActivity {
    Date d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);

        Intent intent = getIntent();
        String a = intent.getExtras().getString("a");
        String b = intent.getExtras().getString("b");
        String c = intent.getExtras().getString("c");
        String d = intent.getExtras().getString("d");
        String e = intent.getExtras().getString("e");
        String f = intent.getExtras().getString("f");
        String g = intent.getExtras().getString("g");
        String h = intent.getExtras().getString("h");










//        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
//        try {
//            d = sdf.parse(a);
//
//        }catch (ParseException ex){
//            //ddf
//        }
//
//        //sdf.applyPattern("dd MMM yyyy hh:mm");
//       // System.out.println(sdf.format(d));
//
//        Toast.makeText(BusList.this,d.toString(),
//                Toast.LENGTH_LONG).show();


    }
}
