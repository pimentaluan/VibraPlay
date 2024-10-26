package com.luanpimenta.VibraPlay.models;

public class Podcast extends Audio{
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRate() {
        if (this.getLikesTotal() >= 1000){
             return 10;
        } else if (this.getLikesTotal() >= 500) {
            return 8;
        } else if (this.getLikesTotal() >= 250) {
            return 6;
        } else if (this.getLikesTotal() >= 125) {
            return 4;
        } else {
            return 2;
        }
    }
}
