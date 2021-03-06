package com.example.nwhacks;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class DataModel implements Comparable<DataModel>{

    private Drawable drawable;
    private String title;
    private List<String> choices;
    private String correctWord;

    public DataModel(Drawable drawable, List<String> choices) {
        this.drawable = drawable;
        title = String.format(Locale.ENGLISH, "Word Hidden");
        this.choices = choices;
        correctWord = choices.get(0);
        Collections.shuffle(choices);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(DataModel d) {
        return this.getTitle().compareTo(d.getTitle());
    }

}
