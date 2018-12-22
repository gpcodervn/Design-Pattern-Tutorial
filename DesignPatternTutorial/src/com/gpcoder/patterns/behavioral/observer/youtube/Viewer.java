package com.gpcoder.patterns.behavioral.observer.youtube;

public class Viewer {
    private YoutubeChanel subscribedChanel;
    private String name;
 
    public Viewer(String name, YoutubeChanel subscribedChanel) {
        this.subscribedChanel = subscribedChanel;
        this.subscribedChanel.subscribe(this);
        this.name = name;
    }
    
    public void update(){
        System.out.println(name +": Chanel " + subscribedChanel.getChanelName() + " has published a video!");
    }
}