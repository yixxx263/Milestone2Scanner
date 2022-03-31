package com.example.milestone2scanner.ui.scanned;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.milestone2scanner.R;

public class ScannedFragment extends Fragment {

    private ScannedViewModel scannedViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        scannedViewModel =
                new ViewModelProvider(this).get(ScannedViewModel.class);
        View root = inflater.inflate(R.layout.fragment_scanned, container, false);
        //final TextView textView = root.findViewById((R.id.text_scanned));

        return root;
    }
}