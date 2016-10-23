package com.citech.vanka_sangashetty.proto1.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.citech.vanka_sangashetty.proto1.R;

/**
 * Created by Vanka on 28-04-2016.
 */
public class FacultyFragment extends Fragment {


    private ImageButton bcse, bise, bece, beee, bmech, bciv,mcse,mmba,mmca;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faculty, container, false);
        bcse = (ImageButton) view.findViewById(R.id.cse_fac);
        bise = (ImageButton) view.findViewById(R.id.ise_fac);
        bece = (ImageButton) view.findViewById(R.id.ece_fac);
        beee = (ImageButton) view.findViewById(R.id.eee_fac);
        bmech = (ImageButton) view.findViewById(R.id.mec_fac);
        bciv = (ImageButton) view.findViewById(R.id.civ_fac);
        mcse = (ImageButton) view.findViewById(R.id.pcse_fac);
        mmca = (ImageButton) view.findViewById(R.id.pmca_fac);
        mmba = (ImageButton) view.findViewById(R.id.mba_fac);




        final FragmentManager fm = getFragmentManager();

        bcse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacCse());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        bise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacIse());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        bece.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacEce());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        beee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacEee());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        bmech.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacMech());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        bciv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacCiv());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        mcse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacBas());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        mmca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacMca());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        mmba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame3, new FragFacMba());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        return view;
    }
}
