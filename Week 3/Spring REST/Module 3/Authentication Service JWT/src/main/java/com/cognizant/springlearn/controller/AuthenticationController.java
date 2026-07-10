package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate() {
        LOGGER.info("START");

        String token = Base64.getEncoder()
                .encodeToString("user:pwd".getBytes());

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        LOGGER.info("END");
        return response;
    }
}