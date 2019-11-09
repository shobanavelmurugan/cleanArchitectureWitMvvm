package com.ibot.cyranosystems.mvvmandroid.viewmodel;

import androidx.databinding.BaseObservable;

import com.ibot.cyranosystems.mvvmandroid.R;
import com.ibot.cyranosystems.mvvmandroid.model.User;

/**
 * Created by innobot-linux-7 on 9/11/19,09,cleanArchitectureWitMvvm.
 */
public class UserModel extends BaseObservable {
    public String passwordhint;
    private String email;
    private String password;
    private String emailhint;

    public UserModel(User user) {
        this.emailhint=user.emailhint;
        this.passwordhint=user.passwordhint;
    }

    public String getPasswordhint() {
        return passwordhint;
    }

    public void setPasswordhint(String passwordhint) {
        this.passwordhint=passwordhint;
        notifyPropertyChanged(R.id.edtPassword);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
        notifyPropertyChanged(R.id.edtEmail);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getEmailhint() {
        return emailhint;
    }

    public void setEmailhint(String emailhint) {
        this.emailhint=emailhint;
    }
}
