package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by 16033265 on 7/23/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<BoxItem> toDoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BoxItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        toDoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView ivBlue = rowView.findViewById(R.id.imageViewColour);
        ImageView ivOrange = rowView.findViewById(R.id.imageViewColour);
        ImageView ivBrown = rowView.findViewById(R.id.imageViewColour);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        BoxItem currentItem = toDoList.get(position);

        if (currentItem.getIsBox()=="blue") {
            ivBlue.setImageResource(R.drawable.blue_box);
        } else if(currentItem.getIsBox()=="orange") {
            ivOrange.setImageResource(R.drawable.orange_box);


        }else if(currentItem.getIsBox()=="brown"){
            ivBrown.setImageResource(R.drawable.brown_box);
        }


        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
