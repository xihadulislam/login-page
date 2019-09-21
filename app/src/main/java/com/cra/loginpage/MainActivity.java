package com.cra.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity {



    private TextView textView;
    private Button button;
    MaterialEditText email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.texttttt);
        email = findViewById(R.id.loginemailId);
        pass = findViewById(R.id.loginPassId);
        button = findViewById(R.id.loginId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String Email = email.getText().toString().trim();
                final String Pass = pass.getText().toString().trim();
                Toast.makeText(MainActivity.this, Email +"\n"+Pass, Toast.LENGTH_LONG).show();

            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                finish();
            }
        });

    }
}
