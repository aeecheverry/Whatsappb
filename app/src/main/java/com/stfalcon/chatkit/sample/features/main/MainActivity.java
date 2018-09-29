package com.stfalcon.chatkit.sample.features.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.stfalcon.chatkit.sample.R;
import com.stfalcon.chatkit.sample.features.demo.def.DefaultDialogsActivity;

/*
 * Created by troy379 on 04.04.17.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DefaultDialogsActivity.open(this);
    }
}
