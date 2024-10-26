package com.luanpimenta.VibraPlay.models;

public class MyPreferences {
    public void include(Audio audio){
        if (audio.getRate() >= 8 ){
            System.out.println(audio.getTitle() + " é excelente!");
        } else if (audio.getRate() >= 6) {
            System.out.println(audio.getTitle() + ", tem quem goste");
        } else {
            System.out.println(audio.getTitle() + ", esse não tem o povo");
        }
    }
}
