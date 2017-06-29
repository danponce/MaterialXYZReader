package com.example.xyzreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BodyTextActivity extends AppCompatActivity
{
    public static final String BODY_TEXT = "body_text";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_text);

        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            String bodyText = extras.getString(BODY_TEXT);

            TextView bodyTextView = (TextView) findViewById(R.id.body_textview);

            bodyTextView.setText(bodyText);

        }
    }
}
