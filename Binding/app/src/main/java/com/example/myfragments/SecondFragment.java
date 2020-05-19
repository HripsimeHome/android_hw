package com.example.myfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfragments.databinding.FragmentSecondBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, // Fragmeti view sargelu hamar
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSecondBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false);
        View view = binding.getRoot();
        SharedViewModel model = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        binding.setViewModel(model);
        binding.setLifecycleOwner(getActivity());
        return view;
    }
}
