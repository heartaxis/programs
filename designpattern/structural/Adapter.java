package com.designpattern.structural;


interface MediaPlayer {
    public void play(String mediaType, String fileName);
}

interface AdvancedMediaPlayer {
    public void playVideo(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video file. Name: "+ fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(){
        advancedMusicPlayer = new VlcPlayer();
    }

    @Override
    public void play(String mediaType, String fileName) {
        advancedMusicPlayer.playVideo(fileName);
    }
}

class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter=new MediaAdapter();

    @Override
    public void play(String mediaType, String fileName) {
        //inbuilt support to play mp3 music files
        if(mediaType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(mediaType.equalsIgnoreCase("mp4")){
            mediaAdapter.play(mediaType, fileName);
        }
    }
}

public class Adapter {
    public static void main(String args[]) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
    }
}
