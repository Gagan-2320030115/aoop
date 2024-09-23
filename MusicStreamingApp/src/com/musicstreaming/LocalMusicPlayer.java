package com.musicstreaming;


class LocalMusicPlayer implements MusicPlayer {
    public void play() {
        System.out.println("Playing music from local files...");
    }
}


class OnlineStreamingPlayer implements MusicPlayer {
    public void play() {
        System.out.println("Playing music from online streaming service...");
    }
}


class RadioPlayer implements MusicPlayer {
    public void play() {
        System.out.println("Playing music from a radio station...");
    }
}
