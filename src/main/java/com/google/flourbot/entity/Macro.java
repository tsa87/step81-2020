package com.google.flourbot.entity;

public class Macro {
    public String creatorId;
    public String macroName;
    public String docId;
    public Trigger macroTrigger;
    public Action macroAction;
    
    public Macro (String creatorId, String macroName, String docId, Object macroTrigger, Object macroAction) {
        this.creatorId = creatorId;
        this.macroName = macroName;
        this.docId = docId;
        this.macroTrigger = macroTrigger;
        this.macroAction = macroAction;
    }

    public String getCreatorId () {
        return creatorId;
    }

    public String getMacroName () {
        return macroName;
    }

    public String getDocId () {
        return docId;
    }
}