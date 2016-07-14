package com.example.Surbhi.myapplication.backend;

import com.example.Joker;

import sun.rmi.runtime.Log;

/** The object model for the data we are sending through endpoints */
public class MyBean {


     String myData;
//    public MyBean(String s)
//    {
//        myData=s;
//    }

    public String getMyJoke()
    {
        return myData;
    }
    public String getData() {
        return myData;
    }

    public void setData(String data) {

        myData = data;
    }


/*
    public String getJoke()
    {
        return new Joker().getJoke();
    }
*/
}