package com.example.navigationcomponent.models;

import android.view.View;

import androidx.lifecycle.ViewModel;

public class ProfileModel extends ViewModel {
    private String profileName = null;
    public String getProfileName()
    {
        return profileName;
    }
    public void setNewName (String name)
    {
        profileName = name;
    }

}
