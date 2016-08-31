package com.example.administrator.popballs;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button btn;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i(TAG, "fdsaklfjasl");
        btn = (Button) findViewById(R.id.mybutton);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SecondActivity.class);
        ContentResolver resolver = this.getContentResolver();
        resolver.delete(Uri.parse("http://content.google.com"), "where id=?", new String[]{""});
//        resolver.



//        resolver.call(Uri.EMPTY, INPUT_METHOD_SERVICE, ACCESSIBILITY_SERVICE, Bundle.EMPTY);
//        intent.setClass(MainActivity.this,SecondActivity.class);
//        startActivity(intent);
                startActivity(intent);

    }
}
