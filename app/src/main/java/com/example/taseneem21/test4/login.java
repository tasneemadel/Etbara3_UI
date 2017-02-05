package com.example.taseneem21.test4;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by taseneem 21 on 2/4/2017.
 */
public class login extends ActionBarActivity {
    public static boolean first = true;
    Button loginbutton;
    TextView signup;
    String usernametxt;
    String passwordtxt;
    EditText password;
    EditText username;
    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    public static final String LOGIN_URL = "http://simplifiedcoding.16mb.com/UserRegistration/volleyLogin.php";

    public static final String KEY_USERNAME="username";
    public static final String KEY_PASSWORD="password";


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.input_password);
        loginbutton = (Button) findViewById(R.id.btn_login);
        signup=(TextView) findViewById(R.id.link_signup);

        loginbutton.setOnClickListener(new View.OnClickListener() {

                                           public void onClick(View arg0) {







                                               // Retrieve the text entered from the EditText
                                               usernametxt = username.getText().toString();
                                               passwordtxt = password.getText().toString();

                                               //    userLogin();

                                               if (usernametxt.equalsIgnoreCase("") || passwordtxt.equalsIgnoreCase("") ) {
                                                   Toast.makeText(login.this, "Please Complete the required Fields", Toast.LENGTH_SHORT).show();
                                               } else {
                                                   final ProgressDialog progressDialog = new ProgressDialog(login.this,
                                                           R.style.AppTheme_Dark_Dialog);
                                                   progressDialog.setIndeterminate(true);
                                                   progressDialog.setMessage("Authenticating...");
                                                   progressDialog.show();
                                                   Intent i = new Intent(login.this, Home.class);
                                                   startActivity(i);
                                                   finish();

                                               }


                                               }

                                       }

        );

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(login.this, signup.class);

                startActivity(intent);
                finish();
            }
        });

    }







    private void userLogin() {



    }

    private void openProfile(){
        Intent intent = new Intent(this, Home.class);
        intent.putExtra(KEY_USERNAME, usernametxt);
        startActivity(intent);
    }
}
