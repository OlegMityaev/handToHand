package com.example.handtohand.ui.enter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.handtohand.databinding.FragmentEnterBinding;
import com.example.handtohand.ui.enter.EnterViewModel;

public class EnterFragment extends Fragment {

    private EnterViewModel enterViewModel;
    private FragmentEnterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        enterViewModel =
                new ViewModelProvider(this).get(EnterViewModel.class);

        binding = FragmentEnterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}