package com.joyapp.apptemplate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by JOY on 5/28/2016.
 */
public class Group {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("keywords")
    private List<Keyword> keywords;

    public Group(String id, String name, List<Keyword> keywords) {
        this.id = id;
        this.name = name;
        this.keywords = keywords;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", keywords=" + keywords.toString() +
                '}';
    }
}
