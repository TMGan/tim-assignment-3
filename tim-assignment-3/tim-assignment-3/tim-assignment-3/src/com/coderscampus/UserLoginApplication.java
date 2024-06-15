package com.coderscampus;

import java.io.IOException;


public class UserLoginApplication {
	

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		User[] newUser = fileService.readFile();
		fileService.getInfo(newUser);
		}
	}

