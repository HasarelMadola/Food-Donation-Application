package com.dev.hasarelm.wastefooddonation.Activity.Rider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dev.hasarelm.wastefooddonation.R;

public class RiderHistoryFragment extends Fragment {

    View rootView;

    public RiderHistoryFragment() {

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.rider_history_fragment, container, false);

        return rootView;
    }
}