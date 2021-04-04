package com.example.navigationcomponent.presenter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigationcomponent.R;


public class LoginFragment extends Fragment {

    private Button loginBtn;
    private TextView registerTV;



    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loginBtn=view.findViewById(R.id.btnLogin);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle= new Bundle();
                bundle.putString("msg","Welcome to Profile Panel");

              Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_profileFragment,bundle);
            }
        });

        registerTV=view.findViewById(R.id.registerClick);
        registerTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Welcome To register panel", Toast.LENGTH_SHORT).show();

            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment);
            
            }
        });
    }
}