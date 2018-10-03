package com.stfalcon.chatkit.sample.features.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.stfalcon.chatkit.sample.R;
import com.stfalcon.chatkit.sample.features.demo.def.DefaultDialogsActivity;

/*
 * Created by troy379 on 04.04.17.
 */
public class MainActivity extends AppCompatActivity {

    private FirebaseAuth myAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DefaultDialogsActivity.open(this);

        myAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart(){
        super.onStart();

        FirebaseUser currentUser = myAuth.getCurrentUser();

        if (currentUser == null) {
            Intent startIntent = new Intent( MainActivity.this,LoginActivity.class);
            startActivity(startIntent);
            finish();
        }else{
            Intent startIntent = new Intent( MainActivity.this,DefaultDialogsActivity.class);
            startActivity(startIntent);
            finish();
        }
    }
}
