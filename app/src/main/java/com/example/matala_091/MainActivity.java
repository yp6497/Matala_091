package com.example.matala_091;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
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

        return true;
    }

    public void moveP(View view) {

        Intent si = new Intent(this,SecondActivity.class);
        startActivity(si);
    }
}