package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView tname,tpass;
public static final String DEFAULT="N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        tname=findViewById( R.id.textView3 );
        tpass=findViewById( R.id.textView4 );
    }
    public void load(View v){
        SharedPreferences sharedPreferences=getSharedPreferences( "mydata",MODE_PRIVATE );
        String name=sharedPreferences.getString( "name",DEFAULT );
        String pass=sharedPreferences.getString( "password",DEFAULT );
        if(name.equals( DEFAULT )||pass.equals( DEFAULT )){
            Toast.makeText( this,"not added",Toast.LENGTH_LONG ).show();
        }else{

            Toast.makeText( this,"sucessfully added",Toast.LENGTH_LONG ).show();
            tname.setText( name );
            tpass.setText( pass );
        }

    }
    public void previous(View v){
        Intent intent =new Intent( this,MainActivity.class );
        startActivity( intent );

    }
}
