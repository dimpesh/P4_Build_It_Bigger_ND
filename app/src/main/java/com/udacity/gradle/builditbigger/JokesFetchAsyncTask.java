package com.udacity.gradle.builditbigger;



/**
 * Created by DIMPESH : ${month}
 */

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.Joker;
import com.example.surbhi.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

import dimpesh.app.mylibrary.LibraryActivity;

///public class JokesFetchAsyncTask extends AsyncTask<Context, Void, String> {
public class JokesFetchAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static MyApi myApiService = null;
    private Context context;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        MainActivity.pg.setVisibility(View.VISIBLE);
    }

    //    @Override
    protected String doInBackground(Pair<Context, String>... params) {


//        protected String doInBackground(Context...mContext){
        Log.v("My String : ","doInBack Called");
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8070/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }
        context = params[0].first;
        String name = params[0].second;
//        context =mContext[0];
        try {
//             return myApiService.sayHi().execute().getMyJoke();
            return myApiService.sayHi(new Joker().getJoke()).execute().getData();
//                return myApiService.getJoke().toString();
//            return myApiService.getJoke().execute().getData();

        } catch (IOException e) {
            return e.getMessage();
        }
//        return new Joker().getJoke();
    }

    @Override
    protected void onPostExecute(String result) {
        Log.v("My String : ","onPost Called");
        MainActivity.pg.setVisibility(View.INVISIBLE);

        if(result!=null) {
//            Toast.makeText(context, result, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(context,LibraryActivity.class);
            intent.putExtra("key",result);

                Log.v("My String : ",result);
            context.startActivity(intent);
        }
        else
        {
            Toast.makeText(context, "Error in fetching...", Toast.LENGTH_LONG).show();
            Log.v("My String : ","error...");
        }
    }


}