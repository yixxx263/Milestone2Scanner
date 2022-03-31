package com.example.milestone2scanner.ui.scanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.milestone2scanner.R;


public class ScannerFragment extends Fragment {

    private ScannerViewModel scannerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        scannerViewModel =
                new ViewModelProvider(this).get(ScannerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_scanner, container, false);

        return root;
    }
}