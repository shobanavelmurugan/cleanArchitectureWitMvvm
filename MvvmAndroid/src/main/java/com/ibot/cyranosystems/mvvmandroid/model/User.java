package com.ibot.cyranosystems.mvvmandroid.model;

/**
 * Created by innobot-linux-7 on 9/11/19,09,cleanArchitectureWitMvvm.
 */
public class User {
    private String email;
    private String password;
    public String emailhint;
    public String passwordhint;

    public User(String email, String password) {
        this.emailhint=email;
        this.passwordhint=password;
    }


}
