package com.google.flourbot.entity;

public class Trigger {
    
    public String triggerCommand;
    public String triggerType;  

    public Trigger (String triggerCommand, String triggerType) {
        this.triggerCommand = triggerCommand;
        this.triggerType = triggerType;
    }

}