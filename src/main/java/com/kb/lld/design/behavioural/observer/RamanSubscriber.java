package com.kb.lld.design.behavioural.observer;

public class RamanSubscriber implements Observer{
    private String name;
    private String email;

    public RamanSubscriber(String name, String email){
        this.name = name;
        this.email = email;
    }
    @Override
    public void update() {
        System.out.println(name + " received Notification from channel");
    }
}
