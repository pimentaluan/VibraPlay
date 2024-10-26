package com.luanpimenta.VibraPlay.models;

public class Music extends Audio{
    private String album;
    private String artist;
    private String style;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public int getRate() {
        if (this.getReproductionsTotal() >= 5000){
            return 10;
        } else if (this.getReproductionsTotal() >= 2500) {
            return 8;
        } else if (this.getReproductionsTotal() >= 1250) {
            return 6;
        } else if (this.getReproductionsTotal() >= 625) {
            return 4;
        } else {
            return 2;
        }
    }
}
