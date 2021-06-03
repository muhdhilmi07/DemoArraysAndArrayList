package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);
        ArrayList<String> al = new ArrayList<String>();
        //continue view the code in the worksheet
        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("durian");

        al.set(-1,"dragon fruit");


        System.out.println("Size is : " + al.size());

        String msg = "";
        for (int i = 0; i < al.size(); i ++){
            msg += al.get(i) + "\n";
        }

        System.out.println(msg);
        tv.setText(msg);

    }
}






