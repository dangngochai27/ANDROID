package com.example.student.dangngochai_16062001;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMain;
    Button btnMain;
    FragmentA fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMain = (TextView) findViewById(R.id.tvMain);
        btnMain = (Button) findViewById(R.id.btnMain);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ánh xạ Fragment qua MainActivity
                fragmentA = (FragmentA)
                        getFragmentManager().findFragmentById(R.id.fragmentA);
                fragmentA.edtFragmentA.setText("KFC");
            }
        });
    }


}
