package lmt.pvt.ducat.mysqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1;
    Button btn;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.editText);
        editText1= (EditText) findViewById(R.id.editText2);
        btn= (Button) findViewById(R.id.button);
        sqLiteDatabase=openOrCreateDatabase("Shekhar",MODE_PRIVATE,null);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                String s1=editText1.getText().toString();
                sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS student(Username VARCHAR,Password VARCHAR)");
                sqLiteDatabase.execSQL("INSERT INTO student(Username,Password) VALUES('"+s+"','"+s1+"')");
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
