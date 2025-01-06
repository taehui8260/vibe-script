package com.taehui.vibescribe.model;

import lombok.Data;

@Data
public class ScriptModel {
    private String script;

    public String getScript() {
        return script;
    }
    public void setScript(String script){
        this.script = script;
    }
}
