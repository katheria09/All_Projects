package com.example.abhimanyu.get_numberfrom_content;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);
        e1= (EditText) findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_PICK,Uri.parse("content://contacts"));
                i.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
                startActivityForResult(i, 3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==3){

            Uri mycontact=data.getData();
            String[] projection={ContactsContract.CommonDataKinds.Phone.NUMBER};
            Cursor s = getContentResolver().query(mycontact,projection,null,null,null);
            s.moveToFirst();
            int index=s.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                    String a=s.getString(index);
            e1.setText(""+a);
        }
    }
}
