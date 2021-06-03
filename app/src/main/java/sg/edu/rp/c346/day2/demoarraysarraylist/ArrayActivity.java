package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ArrayActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        tv = findViewById(R.id.textView1);
        String []array=new String[3];
        //continue view the code in the worksheet
        array[0] = "apple";
        array[1] = "banana";
        array[2] = "cherry";


        System.out.println("Size is : " + array.length);

        String msg = "";
        for (int i = 0; i < array.length; i ++){
            msg += array[i] + "\n";
        }

        System.out.println(msg);


        tv.setText(msg);


    }
}