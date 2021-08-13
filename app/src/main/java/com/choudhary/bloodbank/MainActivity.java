package com.choudhary.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email_edit,password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.button_login);
        email_edit = findViewById(R.id.email_edit_text_id);
        password = findViewById(R.id.editTextTextPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if (email_edit.getText().toString().isEmpty() || password.getText().toString().isEmpty()){


                   Toast.makeText(MainActivity.this, "Invalid Details! Enter correct details ", Toast.LENGTH_SHORT).show();
                   return;
               }

               String EMAIL = email_edit.getText().toString().trim();
               String PASSWORD = password.getText().toString().trim();

               if (EMAIL.equals("ADMIN") && PASSWORD.equals("000000")){
                   Toast.makeText(MainActivity.this, "Welcome Admin", Toast.LENGTH_SHORT).show();
                   Intent in = new Intent(MainActivity.this,HomeActivity.class);
                   startActivity(in);
                   return;
               }

                if (EMAIL.equals("User1") && PASSWORD.equals("123456")){
                    Toast.makeText(MainActivity.this, "LoggedIn succesfully !", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(MainActivity.this,UserHomeAcitvity.class);
                    startActivity(in);
                    return;
                }

                if (EMAIL.equals("User2") && PASSWORD.equals("123456")){
                    Toast.makeText(MainActivity.this, "LoggedIn succesfully !", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(MainActivity.this,UserHomeAcitvity.class);
                    startActivity(in);
                    return;
                }

                if (EMAIL.equals("User3") && PASSWORD.equals("123456")){
                    Toast.makeText(MainActivity.this, "LoggedIn succesfully !", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(MainActivity.this,UserHomeAcitvity.class);
                    startActivity(in);
                    return;
                }
                if (EMAIL.equals("User4") && PASSWORD.equals("123456")){
                    Toast.makeText(MainActivity.this, "LoggedIn succesfully !", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(MainActivity.this,UserHomeAcitvity.class);
                    startActivity(in);
                    return;
                }

                if (EMAIL.equals("User5") && PASSWORD.equals("123456")){
                    Toast.makeText(MainActivity.this, "LoggedIn succesfully !", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(MainActivity.this,UserHomeAcitvity.class);
                    startActivity(in);
                    return;
                }


                Toast.makeText(MainActivity.this, "No Records Found !" +
                        "", Toast.LENGTH_SHORT).show();

            }
        });
    }
}