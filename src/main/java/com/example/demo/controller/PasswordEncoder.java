package com.example.demo.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	
	public static void main(String args[]) {
		BCryptPasswordEncoder bcpBCryptPasswordEncoder = new BCryptPasswordEncoder();
		String rawPassword = "1234567890";
		String encodedPassword = bcpBCryptPasswordEncoder.encode(rawPassword);
		System.out.println(encodedPassword);
	}

}
