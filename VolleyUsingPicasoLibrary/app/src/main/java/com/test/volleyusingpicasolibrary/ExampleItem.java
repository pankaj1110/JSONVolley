package com.test.volleyusingpicasolibrary;

public class ExampleItem {

    private  String mImageUrl;
   private String mCraeator;
    private int mLikes;

    public ExampleItem(String imageUrl, String creator, int likes) {
        mImageUrl = imageUrl;
        mCraeator = creator;
        mLikes = likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCraeator;
    }

    public int getLikeCount() {
        return mLikes;
    }
}
