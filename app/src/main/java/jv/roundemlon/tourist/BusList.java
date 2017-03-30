package jv.roundemlon.tourist;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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


    String bName[] = new String[20];
    String b1[] = new String[20];
    String b2[] = new String[20];
    String b3[] = new String[20];
    String bStartHr[] = new String[20];
    String bStartMin[] = new String[20];
    String bPrice[] = new String[20];


    String f1;
    String f2;
    String f3;



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
        f1 = intent.getExtras().getString("i");
        f2 = intent.getExtras().getString("j");
        f3 = intent.getExtras().getString("k");





        Firebase.setAndroidContext(this);

        Firebase mRootRef = new Firebase("https://tourist-23bb8.firebaseio.com/");

        busRef = mRootRef.child("bus");
        numberRef = mRootRef.child("busNum");



        numberRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                countover = Integer.parseInt(dataSnapshot.getValue(String.class));
                dummy= new String[countover];
                count = 0;
                busRef.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                        Log.d("DEBUG","onChildAdded");
                        String res = dataSnapshot.getValue(String.class);
                        String pa[] = res.split("-");

                        bName[count] = pa[0];
                        b1[count] = pa[1];
                        b2[count] = pa[2];
                        b3[count] = pa[3];
                        bStartHr[count] = pa[4];
                        bStartMin[count]= pa[5];
                        bPrice[count] = pa[6];

                        count++;
                        if(count == countover )
                            trigger();

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
            Toast.makeText(this, "im here", Toast.LENGTH_SHORT).show();
            BusAdapter adapter2 = new
                    BusAdapter(BusList.this,bName,b1,b2,b3,bStartHr,bStartMin,bPrice,f1,f2,f3,dummy);
            listbus=(ListView)findViewById(R.id.listViewBus);
            listbus.setAdapter(adapter2);


        }




    }


