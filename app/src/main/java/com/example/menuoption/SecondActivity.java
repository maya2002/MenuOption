package com.example.menuoption;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    ConstraintLayout CL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        CL = findViewById(R.id.CL);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 1, 400, "Cyan");
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
        else if (id == 1)
            CL.setBackgroundColor(Color.BLACK);
        return true;
    }

    public void OC_btnPrvAct(View view) {
        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);
    }
}
