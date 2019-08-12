package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ename,epass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ename=findViewById( R.id.Ename );
        epass=findViewById( R.id.Epass );

    }
    public void submit(View v){
        SharedPreferences pref =getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putString( "name",ename.getText().toString() );
        editor.putString( "password",epass.getText().toString() );
        editor.commit();
        Toast.makeText( this,"sucessful loaded",Toast.LENGTH_LONG ).show();

    }
    public void nextpage(View v){

        Intent intent=new Intent( this,Main2Activity.class );
        startActivity( intent );
        Toast.makeText( this,"nextpages",Toast.LENGTH_LONG ).show();
    }
}
