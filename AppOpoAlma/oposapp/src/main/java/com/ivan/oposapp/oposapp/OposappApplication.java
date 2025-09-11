package com.ivan.oposapp.oposapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
        "com.ivan" // ← asegura que Spring escanee cualquier subpaquete tuyo
    }
)
public class OposappApplication {
    public static void main(String[] args) {
        SpringApplication.run(OposappApplication.class, args);
    }
}
