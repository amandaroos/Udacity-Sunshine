package com.example.android.sunshine.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class DetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Read the intent string passed in from ForecastFragment
        Intent intent = getIntent();
        String forecast = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView textView = (TextView) findViewById(R.id.detail_forecast);
        textView.setText(forecast);
    }

}
