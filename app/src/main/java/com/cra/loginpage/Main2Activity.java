package com.cra.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

public class Main2Activity extends AppCompatActivity {



    private Button button;
    MaterialEditText username,email,pass;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        button = findViewById(R.id.signupId);
        username = findViewById(R.id.usernameId);
        email = findViewById(R.id.emailId);
        pass = findViewById(R.id.passwordId);
        textView = findViewById(R.id.backloginpage);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String Usname = username.getText().toString().trim();
                final String Email = email.getText().toString().trim();
                final String Pass = pass.getText().toString().trim();
                Toast.makeText(Main2Activity.this, Usname +"\n"+Email +"\n"+Pass, Toast.LENGTH_LONG).show();

            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
                finish();
            }
        });

    }
}
