package com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.model;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class User {
    public User(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    private String name;
}
