package jv.roundemlon.tourist;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by Joseph on 30/03/17.
 */


public class BusList extends AppCompatActivity {


    ListView listbus;

    Firebase busRef;
    Firebase numberRef;


    ProgressDialog pDialog;
    String[] dummy;
    int countover = 0;
    int count;
    int childCount = 0;


    String bName[] = new String[30];
    String bStart[] = new String[30];
    String bEnd[] = new String[30];
    String bStartHr[] = new String[20];
    String bStartMin[] = new String[20];
    String bPrice[] = new String[20];
    int price[] =  new int[14];
    //int start[] =  new int[14];

    int diff;



    String bLoc[] = new String[20];
    String ltn[] = new String[15];


    String f1;
    String f2;
    String f3;
    String f4;
    String f5;
    String f6;
    String f7;
    String f8;
    String f9;
    String f10;
    String f11;
    String f12;
    String f13;
    String f14;

    int bLocIndex;

    int k =0;


    int A;

    String district[] = {
            "Thiruvananthapuram",
            "Kollam",
            "Alappuzha",
            "Pathanamthitta",
            "Kottayam",
            "Idukki",
            "Ernakulam",
            "Thrissur",
            "Palakkad",
            "Malappuram",
            "Kozhikode",
            "Wayanad",
            "Kannur",
            "Kasargod"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);

        Intent intent = getIntent();
        final String a = intent.getExtras().getString("a");

        f1 = intent.getExtras().getString("i");
        f2 = intent.getExtras().getString("j");
        f3 = intent.getExtras().getString("k");
        f4 = intent.getExtras().getString("l");
        f5 = intent.getExtras().getString("m");
        f6 = intent.getExtras().getString("n");
        f7 = intent.getExtras().getString("o");
        f8 = intent.getExtras().getString("p");
        f9 = intent.getExtras().getString("q");
        f10 = intent.getExtras().getString("r");
        f11 = intent.getExtras().getString("s");
        f12 = intent.getExtras().getString("t");
        f13 = intent.getExtras().getString("u");
        f14 = intent.getExtras().getString("v");

        try {
            A = Integer.parseInt(a);
        }
        catch (NumberFormatException e1){}

        bLocIndex = 0;
        if(f1.equals("1")){

            bLoc[bLocIndex] = "1";
            bLocIndex++;

        }
        if(f2.equals("1")){

            bLoc[bLocIndex] = "2";
            bLocIndex++;

        }
        if(f3.equals("1")){

            bLoc[bLocIndex] = "3";
            bLocIndex++;

        }
        if(f4.equals("1")){

            bLoc[bLocIndex] = "4";
            bLocIndex++;

        }
        if(f5.equals("1")){

            bLoc[bLocIndex] = "5";
            bLocIndex++;

        }
        if(f6.equals("1")){

            bLoc[bLocIndex] = "6";
            bLocIndex++;

        }

        if(f7.equals("1")){

            bLoc[bLocIndex] = "7";
            bLocIndex++;

        }

        if(f8.equals("1")){

            bLoc[bLocIndex] = "8";
            bLocIndex++;

        }

        if(f9.equals("1")){

            bLoc[bLocIndex] = "9";
            bLocIndex++;

        }

        if(f10.equals("1")){

            bLoc[bLocIndex] = "10";
            bLocIndex++;

        }

        if(f11.equals("1")){

            bLoc[bLocIndex] = "11";
            bLocIndex++;

        }

        if(f12.equals("1")){

            bLoc[bLocIndex] = "12";
            bLocIndex++;

        }

        if(f13.equals("1")){

            bLoc[bLocIndex] = "13";
            bLocIndex++;

        }

        if(f14.equals("1")){

            bLoc[bLocIndex] = "14";
            bLocIndex++;

        }



        bLoc[bLocIndex] = "_";
        bLocIndex++;



        Firebase.setAndroidContext(this);

        Firebase mRootRef = new Firebase("https://tourist-23bb8.firebaseio.com/");

        busRef = mRootRef.child("bus");
        numberRef = mRootRef.child("busNum");



        numberRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                countover = Integer.parseInt(dataSnapshot.getValue(String.class));

                count = 0;
                busRef.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                        Log.d("DEBUG","onChildAdded");
                        String res = dataSnapshot.getValue(String.class);
                        String pa[] = res.split("-");



                        int i=0;
                        for(k =1;k<15;k++)
                        {
                            if(!pa[k].equals("0"))
                            {
                                ltn[i++] = pa[k];
                                Log.d("DEBUG",pa[k]);
                            }
                        }

                        ltn[i] = "0";
                        i++;
                        k=i;


                        for( i=0;i<(bLocIndex-1);i++) {
                            for (int j = 0; j <(k-1); j++)
                            {

                                for(int l =j+1;l<(k-1);l++) {




                                    if (bLoc[i].compareTo(ltn[j]) == 0 && bLoc[i + 1].compareTo(ltn[l]) == 0) {

                                        Log.d("DEBUG", "If:" + i);


                                        int start1 = Integer.parseInt(pa[16]);

                                        if(start1 >= (A-1) && start1 <= (A+1)) {


                                            bName[count] = pa[0];

                                            bStart[count] = district[(Integer.parseInt(ltn[j])-1)];
                                            bEnd[count] = district[(Integer.parseInt(ltn[l])-1)];

                                            int one = Integer.parseInt(ltn[j]);
                                            int two = Integer.parseInt(ltn[l]);
                                            int cost = Integer.parseInt(pa[15]);


                                            diff = two - one;

                                            price[count] = (cost + (10 * diff));



                                            bStartHr[count] = "--";
                                            bStartMin[count] = "--";

                                            bPrice[count] = String.valueOf(price[count]);

                                            count++;
                                        }
                                    }
                                }
                          }
                        }
                        dummy = new String[count];
                        childCount++;
                        if(countover==childCount)
                            trigger();

                        if(count == 0)
                            Toast.makeText(BusList.this,"Bus not available!", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }

                });

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }





        private void trigger() {

            Log.d("DEBUG","Triggered");
            Toast.makeText(this, "Im here", Toast.LENGTH_SHORT).show();
            BusAdapter adapter2 = new
                    BusAdapter(BusList.this,bName,bStart,bEnd,bStartHr,bStartMin,bPrice,f1,f2,f3,dummy);
            listbus=(ListView)findViewById(R.id.listViewBus);
            listbus.setAdapter(adapter2);


            listbus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent clickIntent = new Intent (BusList.this,Details.class);
                    clickIntent.putExtra("pass1",bName[i]);
                    clickIntent.putExtra("pass2",bStart[i]);
                    clickIntent.putExtra("pass3",bEnd[i]);
                    clickIntent.putExtra("pass4",bPrice[i]);
                    startActivity(clickIntent);
                }
            });



        }




    }


