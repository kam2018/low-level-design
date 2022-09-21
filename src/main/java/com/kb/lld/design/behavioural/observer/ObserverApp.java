package com.kb.lld.design.behavioural.observer;

public class ObserverApp {
    public static void main(String[] args) {
        MusicChannel channel = new MusicChannel("KBJavaChannels");

        Observer kam = new KamSubscriber("Kam", "Gmail");
        Observer raman = new KamSubscriber("Raman", "Gmail");

        channel.subscribe(kam);
        channel.subscribe(raman);

        channel.notifyAllSubscriber();
    }
}
