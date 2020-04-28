package com.example.myfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    private SharedViewModel model;
    private EditText entered_number;
    private float number = 0.0f;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        model = new ViewModelProvider(requireActivity()).get(SharedViewModel.class); // model@ view modelic e kanchvum
        entered_number = view.findViewById(R.id.entered_number);

    view.findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try
            {
                number = Float.parseFloat(entered_number.getText().toString());
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Could not parse" + nfe);
            }

            number = number + 2;
            String numberStr = Float.toString(number);
            model.setName(numberStr);
        }
    });

    view.findViewById(R.id.multiply).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try
            {
                number = Float.parseFloat(entered_number.getText().toString());
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Could not parse" + nfe);
            }

            number = number * 2;
            String numberStr = Float.toString(number);
            model.setName(numberStr);
        }
    });

    view.findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try
            {
                number = Float.parseFloat(entered_number.getText().toString());
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Could not parse" + nfe);
            }

            number = number / 2;
            String numberStr = Float.toString(number);
            model.setName(numberStr);
        }
    });
    }
}
