package com.sz.most;

import com.sz.bean.User;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Girl {

    private List<String> colour;

    private String[] animal;

    private Set<User> userSet;

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public String[] getAnimal() {
        return animal;
    }

    public void setAnimal(String[] animal) {
        this.animal = animal;
    }

    public List<String> getColour() {
        return colour;
    }

    public void setColour(List<String> colour) {
        this.colour = colour;
    }
}
