package com.kentsantin.kentsantinresume.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kentsantin.kentsantinresume.AwardsActivity;
import com.kentsantin.kentsantinresume.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AwardDetails.AwardDetailListener} interface
 * to handle interaction events.
 * Use the {@link AwardDetails#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AwardDetails extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String A_TITLE = "param1";
    private static final String A_DETAILS = "param2";

    // TODO: Rename and change types of parameters
    public String awdTitle = "X";
    public String awdDetails = "Z";

    private AwardDetailListener mListener;

    public AwardDetails() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param awdTitle Parameter 1.
     * @param awdDetails Parameter 2.
     * @return A new instance of fragment AwardDetails.
     */
    // TODO: Rename and change types and number of parameters
    public static AwardDetails newInstance(String awdTitle, String awdDetails) {
        AwardDetails fragment = new AwardDetails();
        Bundle args = new Bundle();
        args.putString(A_TITLE, awdTitle);
        args.putString(A_DETAILS, awdDetails);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {



        }





    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_award_details, container, false);

        if (getArguments() != null) {


            awdTitle = "Award Name";
            awdDetails = "Awd Details";

        } else {


            Bundle bundle = this.getArguments();


            // ISSUE!? If I remove these two lines it runs...
            awdTitle = bundle.getString("EXTRA_AWARDTITLE");
            awdDetails = bundle.getString("EXTRA_AWARDDETAIL");

        }

        TextView awardName = (TextView) view.findViewById(R.id.awardNameTB);
        TextView awardDetailCoreText = (TextView) view.findViewById(R.id.AwardDetailText);

        awardName.setText(awdTitle);

        awardDetailCoreText.setText(awdDetails);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.AwardDetailListener(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AwardDetailListener) {
            mListener = (AwardDetailListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface AwardDetailListener {
        // TODO: Update argument type and name
        void AwardDetailListener(Uri uri);
    }
}