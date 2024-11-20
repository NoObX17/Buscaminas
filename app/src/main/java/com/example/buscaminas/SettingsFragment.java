package com.example.buscaminas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        // Obtén las referencias a los ToggleButton
        ToggleButton buttonEasy = view.findViewById(R.id.button_easy);
        ToggleButton buttonHard = view.findViewById(R.id.button_hard);
        ToggleButton buttonExtreme = view.findViewById(R.id.button_extreme);

        // Listener para manejar el estado seleccionado de los botones
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != buttonEasy) buttonEasy.setChecked(false);
                    if (buttonView != buttonHard) buttonHard.setChecked(false);
                    if (buttonView != buttonExtreme) buttonExtreme.setChecked(false);
                }
            }
        };

        // Asigna el listener a cada ToggleButton
        buttonEasy.setOnCheckedChangeListener(listener);
        buttonHard.setOnCheckedChangeListener(listener);
        buttonExtreme.setOnCheckedChangeListener(listener);

        return view;
    }
}

