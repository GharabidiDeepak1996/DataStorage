package com.example.justsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    SharedPreferences sharedPreferences;


    public static final String PREFERENCE_NAME = "mylogin_data";
    public static final String IS_ALREADY_LOGIN = "is_already_login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences=getSharedPreferences(PREFERENCE_NAME,MODE_PRIVATE);

        boolean isLogin = sharedPreferences.getBoolean(IS_ALREADY_LOGIN, false);

        Log.d(TAG, "onCreate: ");


        if(isLogin){

            Intent intent=new Intent( this,register.class );
            startActivity( intent );

        }
        else{

            Intent intent=new Intent( this,login.class );
            startActivity( intent );

        }

    }
}
