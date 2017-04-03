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

public class BusList extends AppCompatActivity {


    ListView listbus;

    Firebase busRef;
    Firebase numberRef;


    ProgressDialog pDialog;
    String[] dummy;
    int countover = 0;
    int count;
    int childCount = 0;


    String bName[] = new String[20];
    String bStart[] = new String[20];
    String bEnd[] = new String[20];
    String bStartHr[] = new String[20];
    String bStartMin[] = new String[20];
    String bPrice[] = new String[20];
    int price[] =  new int[14];
    int start[] =  new int[14];

    int diff;



    String bLoc[] = new String[20];
    String ltn[] = new String[14];


    String f1;
    String f2;
    String f3;
    String f4;
    String f5;
    String f6;

    int bLocIndex;

    int k =0;


    int A;
//    int B;
//    int C;
//    int D;
//    int E;
//    int F;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);

        Intent intent = getIntent();
        final String a = intent.getExtras().getString("a");
//         String b = intent.getExtras().getString("b");
//       String c = intent.getExtras().getString("c");
//        String d = intent.getExtras().getString("d");
//       String e = intent.getExtras().getString("e");
//        String f = intent.getExtras().getString("f");
       // String g = intent.getExtras().getString("g");
       // String h = intent.getExtras().getString("h");
        f1 = intent.getExtras().getString("i");
        f2 = intent.getExtras().getString("j");
        f3 = intent.getExtras().getString("k");
        f4 = intent.getExtras().getString("l");
        f5 = intent.getExtras().getString("m");
        f6 = intent.getExtras().getString("n");

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

        ///////////

        bLoc[bLocIndex] = "_";
        bLocIndex++;

        ///////////


//        bLoc[0] = "1";
//        bLoc[1] = "2";
//        bLoc[2] = "3";
//        bLoc[3] = "4";
//        bLoc[4] = "5";
//         bLocIndex=2;


        Firebase.setAndroidContext(this);

        Firebase mRootRef = new Firebase("https://tourist-23bb8.firebaseio.com/");

        busRef = mRootRef.child("bus2");
        numberRef = mRootRef.child("busNum2");



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






//                        for(int i=0;i<bLocIndex;i++)
//                        {
//
//                            Log.d("DEBUG","for");
////                            if(pa[1].equals(bLoc[i]) &&  pa[2].equals(bLoc[i+1]) ){
//                            if(pa[1].compareTo(bLoc[i]) == 0 &&  pa[2].compareTo(bLoc[i+1]) == 0) {
//
//                                Log.d("DEBUG","If:" + i);
//
//
//                                bName[count] = pa[0];
//                                bStart[count] = pa[1];
//                                bEnd[count] = pa[2];
//                                bStartHr[count] = pa[3];
//                                bStartMin[count]= pa[4];
//                                bPrice[count] = pa[5];
//
//                                count++;
//
//                            }
//                        }


                        int i=0;
                        for(k =1;k<7;k++)
                        {
//                            if(!pa[k].equals("0"))
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


                                   // Log.d("DEBUG", "for");
//                            if(pa[1].equals(bLoc[i]) &&  pa[2].equals(bLoc[i+1]) ){


                                    if (bLoc[i].compareTo(ltn[j]) == 0 && bLoc[i + 1].compareTo(ltn[l]) == 0) {

                                        Log.d("DEBUG", "If:" + i);


                                        int start1 = Integer.parseInt(pa[8]);

                                        if(start1 >= (A-1) && start1 <= (A+1)) {


                                            bName[count] = pa[0];
//                                bStart[count] = pa[1];
//                                bEnd[count] = pa[2];
//                                        Log.d("DEBUG",ltn[l]);
                                            bStart[count] = ltn[j];
                                            bEnd[count] = ltn[l];

                                            int one = Integer.parseInt(ltn[j]);
                                            int two = Integer.parseInt(ltn[l]);
                                            int cost = Integer.parseInt(pa[7]);

                                            diff = two - one;

                                            price[count] = (cost + (10 * diff));


//                                bStartHr[count] = pa[3];
//                                bStartMin[count] = pa[4];
                                            bStartHr[count] = "--";
                                            bStartMin[count] = "--";

//                                        bPrice[count] = pa[7];
                                            bPrice[count] = String.valueOf(price[count]);
//                                bPrice[count] = "price";

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




        listbus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
//                        Uri.parse(webUrl[i]));
//                startActivity(browserIntent);

                Intent clickIntent = new Intent(BusList.this,Details.class);
                clickIntent.putExtra("pass1",bName[i]);
                clickIntent.putExtra("pass2",bStart[i]);
                clickIntent.putExtra("pass3",bEnd[i]);
                clickIntent.putExtra("pass4",bPrice[i]);
                startActivity(clickIntent);
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


        }




    }


