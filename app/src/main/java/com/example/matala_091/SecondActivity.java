package com.example.matala_091;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Black");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String st=item.getTitle().toString();

        if(st.endsWith("Blue"))
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        if(st.endsWith("Red"))
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        if(st.endsWith("Yellow"))
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        if(st.endsWith("Black"))
            getWindow().getDecorView().setBackgroundColor(Color.BLACK);

        return true;
    }

    public void returnB(View view) {
        finish();
    }
}