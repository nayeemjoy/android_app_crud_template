package com.joyapp.apptemplate;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity {
    private String TAG = "INSTANT";
    private CallbackManager callbackManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login);
        LoginButton loginButton = (LoginButton) findViewById(R.id.facebook_login_button);
        Button alertButton = (Button) findViewById(R.id.facebook_login_button);
        callbackManager = CallbackManager.Factory.create();
        loginButton.setReadPermissions("email");
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d(TAG, "Success: ");
            }

            @Override
            public void onCancel() {
                Log.d(TAG, "Cancel: ");
            }

            @Override
            public void onError(FacebookException exception) {
                Log.d(TAG, "Failed: ");
            }
        });
        Log.d(TAG, "Reached Safely: ");
        alertButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getApplicationContext());
                Log.d(TAG, "Button Clicked: ");
//                AlertDialog alertDialog = alertDialogBuilder.create();
//                alertDialog.show();


            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "On Activity Result: ");
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
