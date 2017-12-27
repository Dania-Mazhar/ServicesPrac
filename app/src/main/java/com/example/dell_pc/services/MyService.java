package com.example.dell_pc.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
    @Override
            public void onCreate()

    {
        Toast.makeText(this, "Service Created" , Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onDestroy (){
        Toast.makeText(this, "Service stopped", Toast.LENGTH_LONG).show();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: Service Started ");


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {


                for (int i = 0; i < 1000; i++) {

                    try {
                        Thread.sleep(1000);
                        Log.d(TAG, "onStartCommand: service running");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        }


    }



    