package com.bank;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "admin123"; // Измени на свой пароль
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
