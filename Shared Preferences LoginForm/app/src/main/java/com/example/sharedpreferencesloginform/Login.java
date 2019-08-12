package com.example.sharedpreferencesloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText ename,epass;
    public static final String PREFERENCE_FILE_NAME = "mydata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        ename=findViewById( R.id.Eusername );
        epass=findViewById( R.id.Epassword );
    }

    public void login(View view) {
        String name=ename.getText().toString();
        String pass=epass.getText().toString();

        if(name.equals( "" ) || pass.equals( "" )){
            Toast.makeText( this,"pls enter username & password",Toast.LENGTH_LONG ).show();
        }else{
            SharedPreferences sharedPreferences =getSharedPreferences(PREFERENCE_FILE_NAME,MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();                                        //save the data
            editor.putString( "name",name );
            editor.putString( "password",pass );
            editor.apply();
            Toast.makeText( this,"sucessful loaded",Toast.LENGTH_LONG ).show();

            Intent intent=new Intent(this,Logout.class);
            startActivity( intent );

        }

    }
}
