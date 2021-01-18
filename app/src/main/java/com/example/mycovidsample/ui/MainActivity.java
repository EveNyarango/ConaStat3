package com.example.mycovidsample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mycovidsample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.findCountryButton)
    Button mfindCountryButton;
    @BindView(R.id.continentEditText)
    EditText mContinentEditText;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;
    @BindView(R.id.aboutButton) Button mAboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        mAboutButton.setOnClickListener(this);
        mfindCountryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String country =  mContinentEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                intent.putExtra("country", country);
                startActivity(intent);
            }

        });
    }


    @Override
    public void onClick(View v) {

    }


}