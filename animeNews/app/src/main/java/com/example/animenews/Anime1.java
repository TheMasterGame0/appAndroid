package com.example.animenews;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.animenews.databinding.Anime1Binding;

public class Anime1 extends Fragment {

    private Anime1Binding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = Anime1Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Resources res = getResources();
        String text = String.format(res.getString(R.string.autor_text), res.getString(R.string.autor_pag_card_1));
        binding.autor.setText(text);

        text = String.format(res.getString(R.string.sinopse_text), res.getString(R.string.sinopse_pag_card_1));
        binding.sinopse.setText(text);

        binding.buttonSecond.setOnClickListener(v ->
                NavHostFragment.findNavController(Anime1.this)
                        .navigate(R.id.action_Anime1_to_Main)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
