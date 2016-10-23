package com.citech.vanka_sangashetty.proto1.fragment;

/**
 * Created by Vanka on 24-04-2016.
 */

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import com.citech.vanka_sangashetty.proto1.R;

public class AcademicFragment extends Fragment {


    private ImageButton bcse, bise, bece, beee, bmech, bciv,mcse,mcne,mmba,msig,mmd,mmca;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_academic, container, false);
        bcse = (ImageButton) view.findViewById(R.id.mb_cse);
        bise = (ImageButton) view.findViewById(R.id.mb_ise);
        bece = (ImageButton) view.findViewById(R.id.mb_ece);
        beee = (ImageButton) view.findViewById(R.id.mb_eee);
        bmech = (ImageButton) view.findViewById(R.id.mb_mec);
        bciv = (ImageButton) view.findViewById(R.id.mb_civ);
        mcse = (ImageButton) view.findViewById(R.id.mb_pcse);
        mcne = (ImageButton) view.findViewById(R.id.mb_pcne);
        mmca = (ImageButton) view.findViewById(R.id.mb_pmca);
        msig = (ImageButton) view.findViewById(R.id.mb_psig);
        mmd = (ImageButton) view.findViewById(R.id.mb_pmd);
        mmba = (ImageButton) view.findViewById(R.id.mb_mba);




        final FragmentManager fm = getFragmentManager();

        bcse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragDeptCse());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        bise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragDeptIse());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        bece.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragDeptEce());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        beee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragDeptEee());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        bmech.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragDeptMech());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        bciv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragDeptCiv());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        mcse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragPostCse());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        mcne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragPostCne());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        mmca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragPostMca());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        msig.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragPostSig());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        mmd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragPostMmd());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        mmba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.content_frame2, new FragPostMba());
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        return view;
    }
}
