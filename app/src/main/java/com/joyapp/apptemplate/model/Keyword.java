package com.joyapp.apptemplate.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JOY on 5/28/2016.
 */
public class Keyword {
    @SerializedName("id")
    private int id;

    @SerializedName("keyword")
    private String keyword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "id=" + id +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
