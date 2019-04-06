package edu.cnm.deepdive.abqwifinder.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cnm.deepdive.abqwifinder.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Reviewer_Fragment extends Fragment {


  public Reviewer_Fragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_reviewer_, container, false);
  }

}
