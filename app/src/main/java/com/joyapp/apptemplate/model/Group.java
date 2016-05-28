package com.joyapp.apptemplate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by JOY on 5/28/2016.
 */
public class Group {

    @SerializedName("name")
    private String name;
    @SerializedName("keywords")
    private List<Keyword> keywords;
    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", keywords=" + keywords.toString() +
                '}';
    }
}
