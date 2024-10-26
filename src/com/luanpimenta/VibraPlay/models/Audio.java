package com.luanpimenta.VibraPlay.models;

public class Audio{
    private String title;
    private int reproductionsTotal;
    private int likesTotal;
    private int rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRate() {
        return rate;
    }

    private void setRate(int rate) {
        this.rate = rate;
    }

    public int getReproductionsTotal() {
        return reproductionsTotal;
    }

    public void play(){
        this.reproductionsTotal ++;
    }

    public int getLikesTotal() {
        return likesTotal;
    }

    public void like() {
        this.likesTotal++;
    }

}
