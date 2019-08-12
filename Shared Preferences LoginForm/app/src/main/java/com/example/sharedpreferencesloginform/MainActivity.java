package com.example.sharedpreferencesloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String PREFERENCE_FILE_NAME = "mydata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


     if(PREFERENCE_FILE_NAME.length() !=0){

         Intent intent=new Intent( this,Logout.class );
         startActivity( intent );



     }else{

         Intent intent=new Intent( this,Login.class );
         startActivity( intent );

     }

    }
}
