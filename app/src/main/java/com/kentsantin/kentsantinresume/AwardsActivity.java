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

    public static final String EXTRA_AWARDTITLE = "EXTRATITLE";
    public static final String EXTRA_AWARDDETAIL = "EXTRADETAIL";
    public static final String AWARDTITLE_HENNESSEY = "XXXXX";
    public static final String AWARDTITLE_NICOL = "XXTTT";
    public static final String AWARDTITLE_EASTREGION = "XXBBB";
    public static final String AWARDTITLE_EMPEXCEL = "XXXXCC";
    public static final String AWARDDETAIL_HENNESSEY = "BBBBBBBBBBBBBBBBBBBB";
    public static final String AWARDDETAIL_NICOL = "CCCCCCCCC";
    public static final String AWARDDETAIL_EASTREGION = "DDDDDDDDDD";
    public static final String AWARDDETAIL_EMPEXCEL = "EEEEEEEEEEEE";


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
                loadAwardDetails(AWARDTITLE_HENNESSEY, AWARDDETAIL_HENNESSEY);
            }
        });

        nicol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAwardDetails(AWARDTITLE_NICOL, AWARDDETAIL_NICOL);
            }
        });

        eastregionleader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAwardDetails(AWARDTITLE_EASTREGION, AWARDDETAIL_EASTREGION);
            }
        });

        employeeexcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAwardDetails(AWARDTITLE_EMPEXCEL, AWARDDETAIL_EMPEXCEL);
            }
        });


    }

    public void loadAwardDetails(String awardTitle, String awardDetails) {

        AwardDetails pickAwardDetails = new AwardDetails();
        Bundle detailsbundle = new Bundle();
        detailsbundle.putString(EXTRA_AWARDTITLE, awardTitle);
        detailsbundle.putString(EXTRA_AWARDDETAIL, awardDetails);
       // AwardDetails.



        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.awarddetailsfragmentcontainer, pickAwardDetails)
                .addToBackStack(null)
                .commit();









    }



    public void AwardDetailListener(Uri uri) {

    }


}
