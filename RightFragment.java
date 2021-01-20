package com.example.lyyapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RightFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInStanceState){
        View view = inflater.inflate(R.layout.main_right,container,false);
        return view;
    }
}
