package com.example.sharedpreferencesloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class Logout extends AppCompatActivity {
    public static final String PREFERENCE_FILE_NAME = "mydata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_logout );
    }

    public void logout(View view) {
        SharedPreferences sharedPreferences=getSharedPreferences( PREFERENCE_FILE_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.clear();
        editor.apply();
        Intent intent=new Intent(this,Login.class);
        startActivity( intent );
}
}
