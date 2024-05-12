package com.example.animenews;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.animenews.databinding.Anime5Binding;

public class Anime5 extends Fragment {

    private Anime5Binding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = Anime5Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Resources res = getResources();
        String text = String.format(res.getString(R.string.autor_text), res.getString(R.string.autor_pag_card_5));
        binding.autor.setText(text);

        text = String.format(res.getString(R.string.sinopse_text), res.getString(R.string.sinopse_pag_card_5));
        binding.sinopse.setText(text);

        binding.buttonSecond.setOnClickListener(v ->
                NavHostFragment.findNavController(Anime5.this)
                        .navigate(R.id.action_Anime5_to_Main)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
