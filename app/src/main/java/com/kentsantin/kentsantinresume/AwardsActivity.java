package com.kentsantin.kentsantinresume;

import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kentsantin.kentsantinresume.Fragments.AwardDetails;

public class AwardsActivity extends AppCompatActivity implements AwardDetails.AwardDetailListener {

    private ImageView henessey;
    private ImageView nicol;
    private ImageView eastregionleader;
    private ImageView employeeexcel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awards);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.awarddetailsfragmentcontainer);

        if (fragment == null) {
            fragment = new AwardDetails();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.awarddetailsfragmentcontainer, fragment);
            transaction.commit();
        }


        henessey = (ImageView)findViewById(R.id.heny);
        nicol = (ImageView)findViewById(R.id.nicolspaceship);
        eastregionleader = (ImageView)findViewById(R.id.eastleader);
        employeeexcel = (ImageView)findViewById(R.id.empexcel);


        henessey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    public void AwardDetailListener(Uri uri) {

    }


}
