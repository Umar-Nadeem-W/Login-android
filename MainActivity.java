package com.example.applab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Register (View view){
        Intent i1 = new Intent (this, Registration.class);
        startActivity(i1);
    }
   public void Login (View view){
        EditText email  = findViewById(R.id.Email);
        String se = email.getText().toString();
        EditText p1 = findViewById(R.id.Password);
        String pe = p1.getText().toString();
        if(se.equals("umar@gmail.com") && pe.equals("123")) {
            Intent log = new Intent(this, Feedback.class);
           //log.putExtra("mail",email);
            startActivity(log);
        }
        else
    {
        Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
    }
    }

}