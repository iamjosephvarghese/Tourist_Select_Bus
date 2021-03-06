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


    private final String bName[];
    private final String bStart[];
    private final String bEnd[];
    private final String bStartHr[];
    private final String bStartMin[];
    private final String bPrice[];
    private final String f1;
    private final String f2;
    private final String f3;



    public BusAdapter(Activity context,
                       String[] bName,String[] bStart,String[] bEnd ,String[] bStartHr, String[] bStartMin,String[] bPrice,String f1, String f2, String f3,String[] dummy) {
        super(context, R.layout.list_bus, dummy);
        this.context = context;

        this.bName = bName;
        this.bStart = bStart;
        this.bEnd = bEnd;
        this.bStartHr = bStartHr;
        this.bStartMin = bStartMin;
        this.bPrice = bPrice;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_bus, null, true);

        TextView busName = (TextView) rowView.findViewById(R.id.busName);
        TextView loc1 = (TextView)rowView.findViewById(R.id.loc1);
        TextView loc2 = (TextView)rowView.findViewById(R.id.loc2);
        TextView startHr = (TextView)rowView.findViewById(R.id.startHr);
        TextView startMin = (TextView)rowView.findViewById(R.id.startMin);
        TextView busPrice = (TextView)rowView.findViewById(R.id.busPrice);

        busName.setText(bName[position]);
        loc1.setText(bStart[position]);
        loc2.setText(bEnd[position]);
        startHr.setText(bStartHr[position]);
        startMin.setText((bStartMin[position]));
        busPrice.setText(bPrice[position]);




        return rowView;


    }
}
