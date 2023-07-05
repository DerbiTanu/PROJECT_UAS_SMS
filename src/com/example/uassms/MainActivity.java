	package com.example.uassms;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

       @Override
       protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

              ((Button) findViewById(R.id.tombolbuatpesan))
                           .setOnClickListener(new OnClickListener() {

                                  public void onClick(View v) {
                                         MainActivity.this.startActivity(new Intent(
                                                       MainActivity.this, BuatPesan.class));
                                  }
                           });
              ((Button) findViewById(R.id.tombolpesankeluar))
                           .setOnClickListener(new OnClickListener() {

                                  public void onClick(View v) {
                                         Intent click = new Intent(MainActivity.this,
                                                       DataPesan.class);
                                         click.putExtra("tipepesan", "sent");
                                         startActivity(click);
                                  }
                            });
              ((Button) findViewById(R.id.tombolpesanmasuk))
                           .setOnClickListener(new OnClickListener() {

                                  public void onClick(View v) {
                                         Intent click = new Intent(MainActivity.this,
                                                       DataPesan.class);
                                         click.putExtra("tipepesan", "inbox");
                                         startActivity(click);
                                  }
                           });

              ((Button) findViewById(R.id.tombolexit))
                           .setOnClickListener(new OnClickListener() {

                                  public void onClick(View v) {
                                         Intent intent = new Intent(Intent.ACTION_MAIN);
                                         intent.addCategory(Intent.CATEGORY_HOME);
                                         intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                         intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                         startActivity(intent);
                                         System.exit(0);
                                  }
                           });
       }

}