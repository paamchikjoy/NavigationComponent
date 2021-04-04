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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigationcomponent.R;


public class ProfileFragment extends Fragment {

    private TextView nameTV,ageTV,addressTV,mobileNumTV;
    private Button editBtn;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            String greetings =bundle.getString("msg");
            Toast.makeText(getActivity(),greetings, Toast.LENGTH_SHORT).show();
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nameTV=view.findViewById(R.id.nameShowTV);
        ageTV=view.findViewById(R.id.ageShowTV);
        editBtn=view.findViewById(R.id.editBtn);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nameTV.getText().toString();
                nameTV.setText(name);
                Toast.makeText(getContext(), "Welcome To Edit profile panel", Toast.LENGTH_SHORT).show();

                Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_editProfile);

            }
        });

        

    }
}