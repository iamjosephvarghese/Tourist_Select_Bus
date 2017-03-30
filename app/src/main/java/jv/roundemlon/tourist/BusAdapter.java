package jv.roundemlon.tourist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Joseph on 30/03/17.
 */

public class BusAdapter extends ArrayAdapter<String> {

    private final Activity context;



//    private final String[] pName;
//    private final String[] pTime;
//    private final String[] pRank;
//    private final String[] pClg;


    private final String bName[];
    private final String b1[];
    private final String b2[];
    private final String b3[];
    private final String bStartHr[];
    private final String bStartMin[];
    private final String bPrice[];
    private final String flag1;
    private final String flag2;
    private final String flag3;



    public BusAdapter(Activity context,
                       String[] bName,String[] b1,String[] b2 ,String[] b3,String[] bStartHr, String[] bStartMin,String[] bPrice,String f1, String f2, String f3,String[] dummy) {
        super(context, R.layout.list_bus, dummy);
        this.context = context;

        this.bName = bName;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.bStartHr = bStartHr;
        this.bStartMin = bStartMin;
        this.bPrice = bPrice;
        this.flag1 = flag1;
        this.flag2 = flag2;
        this.flag3 = flag3;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_bus, null, true);

        TextView busName = (TextView) rowView.findViewById(R.id.busName);
        TextView loc1 = (TextView)rowView.findViewById(R.id.loc1);
        TextView loc2 = (TextView)rowView.findViewById(R.id.loc2);
        TextView loc3 = (TextView)rowView.findViewById(R.id.loc3);
        TextView startHr = (TextView)rowView.findViewById(R.id.startHr);
        TextView startMin = (TextView)rowView.findViewById(R.id.startMin);
        TextView busPrice = (TextView)rowView.findViewById(R.id.busPrice);
//        ImageView imageView1 = (ImageView) rowView.findViewById(R.id.img1);
//
//        TextView txt2 = (TextView) rowView.findViewById(R.id.txt2result);
//        TextView sc2 = (TextView)rowView.findViewById(R.id.sc2);
//        ImageView imageView2 = (ImageView) rowView.findViewById(R.id.img2);
//
//        // TextView location = (TextView) rowView.findViewById(R.id.location);
//        TextView showdate = (TextView) rowView.findViewById(R.id.date);
        busName.setText(bName[position]);
        loc1.setText(b1[position]);
        loc2.setText(b2[position]);
        loc3.setText(b3[position]);
        startHr.setText(bStartHr[position]);
        startMin.setText((bStartMin[position]));
        busPrice.setText(bPrice[position]);



//        // sc1.setText(String.valueOf(passThree[position]));
//
//        Log.d("LOGGER",passThree[position]+"");
//        imageView1.setImageResource(imageId[passOne[position]]);
//
//        txt2.setText(teamName[passTwo[position]]);
//        sc2.setText(String.valueOf(passFour[position]));
//        imageView2.setImageResource(imageId[passTwo[position]]);
//
//        //location.setText(stadium[passThree[position]]);
//        showdate.setText(passFive[position]);


        return rowView;


    }
}
