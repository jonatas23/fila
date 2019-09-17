package com.dg.fila.controller;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilaController {

    final String BASE_URL = "/api/fila";

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    @GetMapping(value = BASE_URL + "/senha", produces = "application/json")
    public String fila() {

        StringBuilder builder = new StringBuilder();
        Integer count = 6;

        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }

        return builder.toString();
    }

    @GetMapping(value = BASE_URL + "/", produces = "application/json")
    public String senha() {
        return RandomStringUtils.randomAlphabetic(6);
    }
}
