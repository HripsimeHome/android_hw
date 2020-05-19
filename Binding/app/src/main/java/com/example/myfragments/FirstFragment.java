package com.example.myfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.myfragments.databinding.FragmentFirstBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentFirstBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false);
        View view = binding.getRoot();
        // Inflate the layout for this fragment
        SharedViewModel model = new ViewModelProvider(requireActivity()).get(SharedViewModel.class); // model@ view modelic e kanchvum
        binding.setViewModel(model);
        binding.setLifecycleOwner(getActivity()); // kverana yerb kjnjvi FirstFragmenti, SecondFragmenti binding@
        return view;
    }
}
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        entered_number = view.findViewById(R.id.entered_number);
//
//    view.findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            try
//            {
//                number = Float.parseFloat(entered_number.getText().toString());
//            }
//            catch (NumberFormatException nfe)
//            {
//                System.out.println("Could not parse" + nfe);
//            }
//
//            number = number + 2;
//            String numberStr = Float.toString(number);
//            model.setName(numberStr);
//        }
//    });
//
//    view.findViewById(R.id.multiply).setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            try
//            {
//                number = Float.parseFloat(entered_number.getText().toString());
//            }
//            catch (NumberFormatException nfe)
//            {
//                System.out.println("Could not parse" + nfe);
//            }
//
//            number = number * 2;
//            String numberStr = Float.toString(number);
//            model.setName(numberStr);
//        }
//    });
//
//    view.findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            try
//            {
//                number = Float.parseFloat(entered_number.getText().toString());
//            }
//            catch (NumberFormatException nfe)
//            {
//                System.out.println("Could not parse" + nfe);
//            }
//
//            number = number / 2;
//            String numberStr = Float.toString(number);
//            model.setName(numberStr);
//        }
//    });
//    }
//}
