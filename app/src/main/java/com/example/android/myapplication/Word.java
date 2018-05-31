package com.example.android.myapplication;

public class Word {
    private int mHeader;
    private int mDescription;
    private int mImageResourceId;


    public Word(int header, int defaultDescription, int imageResource) {
        mHeader=header;
        mDescription=defaultDescription;
        mImageResourceId = imageResource;
    }


    public int getHeader() {
        return mHeader;
    }
    public int getmDefaultDescription() {
        return mDescription;
    }

    public int getmImageResourceId() {

        return mImageResourceId;
    }

}
