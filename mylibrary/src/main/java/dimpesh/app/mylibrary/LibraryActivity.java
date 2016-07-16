package dimpesh.app.mylibrary;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        this.setTitle(R.string.title);
        tv= (TextView) findViewById(R.id.tv_joke);

        String str=getIntent().getExtras().getString("key");
        Log.v("LibraryActivity : ",str);

        tv.setText(str);
    }

    public void launchLibraryActivity(View v)
    {
        Intent myIntent=new Intent(this,LibraryActivity.class);
        startActivity(myIntent);
    }
}
