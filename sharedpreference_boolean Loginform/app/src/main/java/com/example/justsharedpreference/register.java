package com.example.justsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class register extends AppCompatActivity {
     SharedPreferences nSharedPreference;
    public static final String isregister = "key_register";

    public static final String PREFERENCE_NAME1 = "mylogin_data";


    private static final String TAG = "register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void logout(View view){
        Log.d(TAG, "register: ");
        SharedPreferences sharedPreferences=getSharedPreferences( PREFERENCE_NAME1,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(MainActivity.IS_ALREADY_LOGIN, false);
        editor.apply();
        Intent intent=new Intent(register.this,login.class);

        startActivity(intent);

    }
}
