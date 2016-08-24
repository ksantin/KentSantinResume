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
    private String awdTitle;
    private String awdDetails;

    private AwardDetailListener mListener;

    public AwardDetails() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AwardDetails.
     */
    // TODO: Rename and change types and number of parameters
    public static AwardDetails newInstance(String awdTitle, String awdDetails) {
        AwardDetails fragment = new AwardDetails();
        Bundle args = new Bundle();
        args.putString(A_TITLE, awdTitle);
        args.putString(A_DETAILS, awdDetails);
        fragment.setArguments();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString();
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

        TextView awardName = (TextView) getView().findViewById(R.id.awardNameTB);
        TextView awardDetailCoreText = (TextView)getView().findViewById(R.id.AwardDetailText);

        String getAwardName = getArguments().getString("data_awardname");
        awardName.setText(getAwardName);
        String getAwardDetails = getArguments().getString("data_awarddetails");
        awardDetailCoreText.setText(getAwardDetails);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_award_details, container, false);
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
