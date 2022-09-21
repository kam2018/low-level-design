package com.kb.lld.design.behavioural.observer;

public class KamSubscriber implements Observer{
    private String name;
    private String email;

    public KamSubscriber(String name, String email){
        this.name = name;
        this.email = email;
    }
    @Override
    public void update() {
        System.out.println(name + " received Notification from channel");
    }
}
