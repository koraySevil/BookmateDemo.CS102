package com.cemcoma.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cemcoma.myapplication.R;


public class dashboardFragment extends Fragment {
    private TextView usernameTextView;
    private String username;
    private ImageView userImage;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        usernameTextView = (TextView) v.findViewById(R.id.usernameTextViewDash);
        userImage = (ImageView) v.findViewById(R.id.imageView);
        userImage.setBackgroundResource(R.drawable.book);
        usernameTextView.setText(username);

        // Inflate the layout for this fragment
        return v;
    }
}