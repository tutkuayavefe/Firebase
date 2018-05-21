package com.tutku.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference reference = database.getReference("User Info ");
    private DatabaseReference reference2 = database.getReference("User Info2 ");
    private DatabaseReference reference3 = database.getReference("User Info3 ");
    private Button b;
    private EditText e1;
    private EditText e2;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        e1=findViewById(R.id.t1);
        e2=findViewById(R.id.t2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference.child("User Name").setValue(e1.getText().toString());
                reference.child("User email").setValue(e2.getText().toString());
                reference2.child("User email2").setValue(e2.getText().toString());
                reference3.child("User email3").setValue(e2.getText().toString());
            }
        });
    }
}
