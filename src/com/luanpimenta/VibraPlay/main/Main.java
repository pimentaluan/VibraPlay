package com.luanpimenta.VibraPlay.main;

import com.luanpimenta.VibraPlay.models.Music;
import com.luanpimenta.VibraPlay.models.MyPreferences;
import com.luanpimenta.VibraPlay.models.Podcast;

public class Main {
    public static void main(String[] args) {
        MyPreferences myFavorite = new MyPreferences();

        // ========== Testando Música ==========
        System.out.println("=== MÚSICA ===");
        Music myMusic1 = new Music();
        myMusic1.setTitle("Cabeça Branca");
        myMusic1.setArtist("Tiehit");

        // Simula reproduções e likes
        for (int i = 0; i < 2500; i++) myMusic1.play();
        for (int i = 0; i < 100; i++) myMusic1.like();

        // Exibe informações detalhadas da música
        System.out.printf("""
                Música: %s
                Artista: %s
                Reproduções: %d
                Likes: %d
                Classificação: %d
                """,
                myMusic1.getTitle(), myMusic1.getArtist(),
                myMusic1.getReproductionsTotal(), myMusic1.getLikesTotal(),
                myMusic1.getRate());

        // Avaliação baseada na preferência
        myFavorite.include(myMusic1);

        // ========== Testando Podcast ==========
        System.out.println("\n=== PODCAST ===");
        Podcast myPodcast1 = new Podcast();
        myPodcast1.setTitle("Peweecast - ep 1");
        myPodcast1.setHost("Pewee");

        // Simula reproduções e likes
        for (int i = 0; i < 3000; i++) myPodcast1.play();
        for (int i = 0; i < 500; i++) myPodcast1.like();

        // Exibe informações detalhadas do podcast
        System.out.printf("""
                Podcast: %s
                Host: %s
                Reproduções: %d
                Likes: %d
                Classificação: %d
                """,
                myPodcast1.getTitle(), myPodcast1.getHost(),
                myPodcast1.getReproductionsTotal(), myPodcast1.getLikesTotal(),
                myPodcast1.getRate());

        // Avaliação baseada na preferência
        myFavorite.include(myPodcast1);
    }
}
