package com.example.menuoption;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout CL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CL = findViewById(R.id.CL);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menuRed)
            CL.setBackgroundColor(Color.RED);
        else if (id == R.id.menuYellow)
            CL.setBackgroundColor(Color.YELLOW);
        else if (id == R.id.menuGray)
            CL.setBackgroundColor(Color.GRAY);
        return true;
    }

    public void OC_btnNxtAct(View view) {
        Intent t = new Intent(this, SecondActivity.class);
        startActivity(t);
    }
}
