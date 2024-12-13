package com.book.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CORSPreflightController {

    @RequestMapping(value = "/api/**", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptions() {
        return ResponseEntity.ok()
                .header(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "https://bookmanagement-fe-docker.vercel.app")
                .header(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET, POST, PUT, DELETE, OPTIONS")
                .header(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "*")
                .header(HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS, "true")
                .build();
    }
}