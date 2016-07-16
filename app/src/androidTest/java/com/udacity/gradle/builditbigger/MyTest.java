package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

/**
 * Created by DIMPESH : ${month}
 */
public class MyTest extends AndroidTestCase
{

    public void FetchJoke() {
        JokesFetchAsyncTask task = new JokesFetchAsyncTask();
        task.execute(new Pair<Context, String>(getContext(), "Manfred"));
        try {
            String joke = task.get();
        //    String joke ="my joke";
            Log.d("My String : ", "Joke text: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (Exception e) {
            Log.e("My String ", Log.getStackTraceString(e));
        }
    }
/*
    public void runTest()
    {
        Log.d("My String :" ,"runtest called ");
        String myJoke=null;
        JokesFetchAsyncTask task=new JokesFetchAsyncTask();
        task.execute();

        try {
            myJoke=task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Log.v("My String : ","Collected Successfully.."+myJoke);

        assertNotNull(myJoke);

    }
*/
}
