package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<BoxItem> alBox;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);

        alBox = new ArrayList<>();
        BoxItem box1 = new BoxItem("blue");
        BoxItem box2 = new BoxItem("orange");
        BoxItem box3 = new BoxItem("brown");


        alBox.add(box1);
        alBox.add(box2);
        alBox.add(box3);


        caBox = new CustomAdapter(this,R.layout.box_item,alBox);

        lvBox.setAdapter(caBox);
    }
}
