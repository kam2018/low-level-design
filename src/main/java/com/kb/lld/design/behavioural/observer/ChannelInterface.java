package com.kb.lld.design.behavioural.observer;

public interface ChannelInterface {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notifyAllSubscriber();
}
