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
public class GoogleMapsFragment extends Fragment {


  public GoogleMapsFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_google_maps, container, false);
  }

}
