package com.example.yt.myapplication.entitys;

public class VideoBean {
    private String videourl;
    private String imgurl;
    private String tv;

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public VideoBean(String videourl, String imgurl, String tv) {
        this.videourl = videourl;
        this.imgurl = imgurl;
        this.tv = tv;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
