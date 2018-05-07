package com.example.android.glidegalleryevilsecret;

public class Page {

    private int Thumbnail;
    private String NumberPage;

    public Page (int thumbnail, String numberPage){
        Thumbnail = thumbnail;
        NumberPage = numberPage;

    }
    public int getThumbnail() {
        return Thumbnail;
    }
    public String getNumberPage() { return NumberPage; }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
    public void setNumberPage(String numberPage) { NumberPage = numberPage; }
}
