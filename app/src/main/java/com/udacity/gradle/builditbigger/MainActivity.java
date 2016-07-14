package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.util.Pair;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Joker;

import java.util.Random;

import dimpesh.app.mylibrary.LibraryActivity;


public class MainActivity extends AppCompatActivity{

    Joker joker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view)
    {

        joker=new Joker();
//        new JokesFetchAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
//        Toast.makeText(this, joker.getJoke(), Toast.LENGTH_LONG).show();


    }
    /*
    We can launch the activity from our library, and it's
    easy to reuse that activity between different apps!
     */

    public void launchLibraryActivity(View view){
//        joker=new Joker();
//        Intent myIntent = new Intent(getApplicationContext(), LibraryActivity.class);
//        myIntent.putExtra("key",joker.getJoke());
//        startActivity(myIntent);
        new JokesFetchAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
//

//        new JokesFetchAsyncTask().execute(getApplicationContext(),new Joker().getJoke());
    }

}
