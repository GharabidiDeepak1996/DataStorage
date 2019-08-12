package com.example.internalstroage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.SocketHandler;

public class MainActivity extends AppCompatActivity {
EditText ename,epass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ename=findViewById( R.id.Ename );
        epass=findViewById( R.id.Epass );
    }

    public void submit(View v) {
        String name=ename.getText().toString();
        String pass=epass.getText().toString();
        File file1 = null;
        name=name+" ";
        try {
            file1 =getFilesDir();
            FileOutputStream file = openFileOutput( "pass.txt", MODE_PRIVATE );
            file.write( name.getBytes() );  // string to byte
            file.write( pass.getBytes() );
            file.close();

        } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this,"save sucessfully "+file1+"  /pass.txt",Toast.LENGTH_LONG ).show();
    }

    public void nextpage(View v){
        Intent intent =new Intent( this,Main2Activity.class );
        startActivity( intent );
    }
    }

