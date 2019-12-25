package edu.tomerbu.lec2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

//activity represents a screen
public class MainActivity extends AppCompatActivity {
    //screen properties:
    private TextView tvCounter;
    private Button btnPlus;
    private Button btnMinus;
    private int counter;
    //private String firstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R.layout -> layout xml files
        setContentView(R.layout.activity_main);

        //All of our resources: (res folder)
        //are accessible via a generated class named R
        //find views by id:
        tvCounter = findViewById(R.id.tvCounter); //0xfffddd
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);

        //R gives us Pointers (integer type)
        //todo: get colors from code, change images from code, change strings from code.
        //react to clicks -> onclick?

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //a method that reacts to clicks.
                counter++;
//                tvCounter.setText(counter + "");
                tvCounter.setText(String.valueOf(counter));
            }
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCounter.setText(String.valueOf(--counter));
            }
        });


        //same with lambda expressions:
        btnMinus.setOnClickListener((v)->{
            tvCounter.setText(String.valueOf(--counter));
        });
    }
}
