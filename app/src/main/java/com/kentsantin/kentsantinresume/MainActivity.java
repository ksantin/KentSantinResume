package com.kentsantin.kentsantinresume;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button profExpButton;
    Button educationButton;
    Button callKentButton;
    Button emailKentButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profExpButton = (Button) findViewById(R.id.profExpButton);
        educationButton = (Button) findViewById(R.id.educationButton);
        callKentButton = (Button) findViewById(R.id.callKentButton);
        emailKentButton = (Button) findViewById(R.id.emailKentButton);

        profExpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToProfExpActivity = new Intent(getApplicationContext(),ProfessionalExperienceActivity.class);
                startActivity(moveToProfExpActivity);
            }
        });

        educationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToEduActivity = new Intent(getApplicationContext(),EducationActivity.class);
                startActivity(moveToEduActivity);
            }
        });

        callKentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri kentPhoneNumber = Uri.parse("tel:9175618636");
                Intent callIntent = new Intent(Intent.ACTION_DIAL,kentPhoneNumber);
                startActivity(callIntent);
            }
        });

        emailKentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"kentsantin@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hey Kent!");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Love the Resume/App!");
                startActivity(emailIntent);
            }
        });
    }
}
