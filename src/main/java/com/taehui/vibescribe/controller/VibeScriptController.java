package com.taehui.vibescribe.controller;

import com.taehui.vibescribe.model.ScriptModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class VibeScriptController {
    @PostMapping("/vibe-script")
    public ResponseEntity<Map<String, Object>> getVibeScript(@RequestBody ScriptModel scriptModel){
        Map<String, Object> response = new HashMap<>();
        response.put("date", scriptModel);
        return ResponseEntity.ok(response);
    }
}
