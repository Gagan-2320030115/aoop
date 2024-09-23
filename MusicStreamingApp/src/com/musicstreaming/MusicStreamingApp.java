package com.musicstreaming;

public class MusicStreamingApp {
    public static void main(String[] args) {
       
        MusicPlayer localPlayer = new LocalMusicPlayer();
        MusicPlayer onlinePlayer = new OnlineStreamingPlayer();
        MusicPlayer radioPlayer = new RadioPlayer();

     
        localPlayer.play();
        onlinePlayer.play();
        radioPlayer.play();

        System.out.println("---------------------");

        
        MusicPlayer volumeControlledLocalPlayer = new VolumeControlDecorator(localPlayer);
        MusicPlayer equalizedOnlinePlayer = new EqualizerDecorator(onlinePlayer);

        
        volumeControlledLocalPlayer.play();
        equalizedOnlinePlayer.play();

        System.out.println("---------------------");

        
        MusicPlayer advancedRadioPlayer = new VolumeControlDecorator(new EqualizerDecorator(radioPlayer));
        advancedRadioPlayer.play();
    }
}
