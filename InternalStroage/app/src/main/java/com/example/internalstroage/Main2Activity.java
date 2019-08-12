package com.example.internalstroage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {
TextView tname,tpass;
    private static final String TAG = "Main2Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        tname=findViewById( R.id.textView3 );
        tpass=findViewById( R.id.textView4 );

    }

    public void load(View v){
        try {
            FileInputStream fileInputStream= openFileInput( "pass.txt" );
            int read = -1;
            StringBuffer Bstring = new StringBuffer();
            while ((read = fileInputStream.read()) != -1) {
                Bstring.append( ( char ) read );
            }
            Log.d( TAG, "load: "+Bstring.toString() );
            //Display :- hshhs ahhsha we need to break

           String name=Bstring.substring( 0,Bstring.indexOf( " " ) );
            String pass=Bstring.substring( Bstring.indexOf( " " ) );
            tname.setText( name );
            tpass.setText( pass );

            Log.d( TAG, "load: "+ tname);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void previous(View v){

        Intent intent =new Intent( this,MainActivity.class );
        startActivity( intent );
    }
}
