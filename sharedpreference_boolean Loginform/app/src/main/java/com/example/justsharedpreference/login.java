package com.example.justsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {



EditText editText,editText1;

    public static final String PREFERENCE_NAME1 = "mylogin_data";

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       editText=findViewById(R.id.user_name);
       editText1=findViewById(R.id.pass);

    }


    public void login(View view){
        String username=editText.getText().toString();
        String pass=editText1.getText().toString();
        SharedPreferences sharedPreferences =getSharedPreferences(PREFERENCE_NAME1,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();                                        //save the data
        editor.putBoolean(MainActivity.IS_ALREADY_LOGIN, true);
        editor.apply();
        Intent intent=new Intent(this,register.class);

        startActivity( intent );


        Log.d(TAG, "login: inside login");
        finish();
    }
}
