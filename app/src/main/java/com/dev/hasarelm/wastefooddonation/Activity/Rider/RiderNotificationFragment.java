package com.dev.hasarelm.wastefooddonation.Activity.Rider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dev.hasarelm.wastefooddonation.R;

public class RiderNotificationFragment extends Fragment {

    View rootView;

    public RiderNotificationFragment() {

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.rider_notification_fragment, container, false);

        return rootView;
    }
}