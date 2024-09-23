package com.musicstreaming;


abstract class MusicPlayerDecorator implements MusicPlayer {
    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer player) {
        this.decoratedPlayer = player;
    }

    public void play() {
        decoratedPlayer.play();
    }
}


class VolumeControlDecorator extends MusicPlayerDecorator {
    public VolumeControlDecorator(MusicPlayer player) {
        super(player);
    }

    public void play() {
        decoratedPlayer.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Adjusting volume...");
    }
}


class EqualizerDecorator extends MusicPlayerDecorator {
    public EqualizerDecorator(MusicPlayer player) {
        super(player);
    }

    public void play() {
        decoratedPlayer.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Applying equalizer settings...");
    }
}
