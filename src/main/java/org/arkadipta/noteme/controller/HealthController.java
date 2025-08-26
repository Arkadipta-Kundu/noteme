package org.arkadipta.noteme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/")
    public String home() {
        return "NoteME API is running! Visit /health to check status, /api/notes for notes API.";
    }
}
