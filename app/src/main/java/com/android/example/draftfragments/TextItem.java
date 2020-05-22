package com.android.example.draftfragments;

public class TextItem {

    private String mFirstText;
    private String mSecondText;
    //set valuue if no data is provided
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId = NO_AUDIO_PROVIDED;


    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    //with image and audio
    public TextItem(String firstText, String secondText, int imageResourceId, int audioResourceId) {
        mFirstText = firstText;
        mSecondText = secondText;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    // with image
    public TextItem(String firstText, String secondText, int imageResourceId) {
        mFirstText = firstText;
        mSecondText = secondText;
        mImageResourceId = imageResourceId;
    }

    //only text
    public TextItem(String firstText, String secondText) {
        mFirstText = firstText;
        mSecondText = secondText;

    }

    public String getFirstText(){
        return mFirstText;
    }
    public String getSecondText(){
        return mSecondText;
    }
    public int getImageResourceId(){ return mImageResourceId; }
    public int getAudioResourceId() { return mAudioResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public boolean hasAudio(){
        return mAudioResourceId != NO_AUDIO_PROVIDED;
    }

}
