package com.example.demo_functionapp;

import java.util.function.Function;

    public class HelloFunction implements Function<String, String> {
        @Override
        public String apply(String message) {
            return "Hello " + message;
        }
    }