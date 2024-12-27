package com.lld.design.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class MusicChannel implements ChannelInterface {
    private String title;
    private List<Observer> observerList;

    public MusicChannel(String title) {
        this.title = title;
        this.observerList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscriber() {
        observerList.forEach(observer -> observer.update());
    }
}
